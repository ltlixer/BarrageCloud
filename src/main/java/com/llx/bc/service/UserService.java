package com.llx.bc.service;

import com.llx.bc.dto.UserLoginInfo;
import com.llx.bc.entity.User;

public interface UserService {

	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
    public UserLoginInfo userLogin(String username,String password);
    
    /**
     * 用户注册
     * @param username
     * @param password
     * @return
     */
    public User userRegister(User user);
    
    /**
     * 判断用户名是否已经存在
     * @param username
     * @return
     */
    public boolean isUsernameExist(String username);
}
