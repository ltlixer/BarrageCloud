package com.llx.bc.controller;

import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.llx.bc.dto.UserLoginInfo;
import com.llx.bc.entity.User;
import com.llx.bc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * 加载Login登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String userLogin(ModelMap model,HttpSession session,HttpServletRequest request) {
		logger.info("login page");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username!=null&&password!=null){
			UserLoginInfo userLoginInfo = userService.userLogin(username, password);
			if(userLoginInfo.getLoginStatus()==200){
				session.setAttribute("user", userLoginInfo.getUser());
				logger.info(userLoginInfo.getUser().getUsername()+" Login.");
				return "redirect:/";
			}
		}
		return "login";
	}
	
	/**
	 * 加载Login登录页面
	 * @return
	 */
	@RequestMapping("/register")
	public String userRegister(ModelMap model,HttpSession session,HttpServletRequest request) {
		logger.info("login page");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String realname = request.getParameter("realname");
		String email = request.getParameter("email");
		if(username!=null&&password!=null&&realname!=null&&email!=null){
			boolean isUsernameExist = userService.isUsernameExist(username);
			if(!isUsernameExist){
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setRealname(realname);
				user.setEmail(email);
				user.setApiKey(UUID.randomUUID().toString().replace("-", ""));
				User userRegister = userService.userRegister(user);
				if(userRegister!=null){
					session.setAttribute("user", userRegister);
					logger.info(userRegister.getUsername()+" register success.");
					return "redirect:/login";
				}
			}
		}
		return "register";
	}
	
	/**
	 * 退出登录
	 * @param model
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping("/logout")
	public String userLogout(ModelMap model,HttpSession session,HttpServletRequest request) {
		logger.info("logout page");
		Enumeration<String> em = session.getAttributeNames();
		while(em.hasMoreElements()){
			session.removeAttribute(em.nextElement().toString());
		}
		session.invalidate();
		return "redirect:/";
	}
	
	/**
	 * 个人中心
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/user-profile")
	public String userProfile(ModelMap model,HttpSession session){
		User user = (User) session.getAttribute("user");
		logger.info(user.getRealname()+" enter user profile");
		model.addAttribute("user",user);
		return "user-profile";
	}
	
}
