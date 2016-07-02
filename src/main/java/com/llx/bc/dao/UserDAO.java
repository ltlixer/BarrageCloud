package com.llx.bc.dao;

import java.util.List;

import com.llx.bc.entity.User;

public interface UserDAO {
	
	/**
	 * 根据用户名和密码获取用户
	 * @param userName
	 * @param password
	 * @return
	 */
	public List<User> getUser(String username, String password);

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public User addUser(User user);
	
	/**
	 * 判断用户名在数据库中是否存在
	 * @param username
	 * @return
	 */
	public boolean isUsernameExsit(String username);
	
	/**
	 * 根据用户名删除用户
	 * @param username
	 * @return
	 */
	public boolean deleteUserByUsername(String username);

}
