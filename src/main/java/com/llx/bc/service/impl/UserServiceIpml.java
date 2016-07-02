package com.llx.bc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.llx.bc.dao.UserDAO;
import com.llx.bc.dto.UserLoginInfo;
import com.llx.bc.entity.User;
import com.llx.bc.service.UserService;

@Service
@Transactional
public class UserServiceIpml implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public UserLoginInfo userLogin(String username, String password) {
		// TODO Auto-generated method stub
		List<User> userList = userDAO.getUser(username, password);
		UserLoginInfo userLoginInfo = new UserLoginInfo();
		if (userList != null&&userList.size()!=0) {
			userLoginInfo.setLoginStatus(200);
			userLoginInfo.setLoginInfo("登录成功");
			userLoginInfo.setUser(userList.get(0));
			return userLoginInfo;
		}else{
			userLoginInfo.setLoginStatus(500);
			userLoginInfo.setLoginInfo("登用户名或密码错误");
			userLoginInfo.setUser(null);
			return userLoginInfo;
		}
	}

	@Override
	public User userRegister(User user) {
		// TODO Auto-generated method stub
		return userDAO.addUser(user);
	}

	@Override
	public boolean isUsernameExist(String username) {
		// TODO Auto-generated method stub
		return userDAO.isUsernameExsit(username);
	}

}
