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
public class BarrageController {
	@Autowired
	private UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(BarrageController.class);
	
	/**
	 * 弹幕云API
	 * @return
	 */
	@RequestMapping("/api")
	public String userLogin(ModelMap model,HttpServletRequest request) {
		String methodName = request.getParameter("method_name");
		if("storage".equals(methodName)){
			
		}
		return "login";
	}
	
}
