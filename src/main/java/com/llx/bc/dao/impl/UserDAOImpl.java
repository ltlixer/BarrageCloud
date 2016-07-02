package com.llx.bc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.llx.bc.dao.UserDAO;
import com.llx.bc.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> getUser(String username, String password){
		Query q= sessionFactory.getCurrentSession().createQuery("From User u Where u.username=:username and u.password=:password");
		q.setString("username", username);
		q.setString("password", password);
		@SuppressWarnings("unchecked")
		List<User> userList = q.list();
		return userList;
	}

	@Override
	public User addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		Query q= sessionFactory.getCurrentSession().createQuery("From User u Where u.username=:username");
		q.setString("username", user.getUsername());
		return (User)q.list().get(0);
	}

	@Override
	public boolean isUsernameExsit(String username) {
		Query q= sessionFactory.getCurrentSession().createQuery("From User u Where u.username=:username");
		q.setString("username", username);
		return q.list()!=null?(!q.list().isEmpty()):false;
	}

	@Override
	public boolean deleteUserByUsername(String username) {
		Query q= sessionFactory.getCurrentSession().createQuery("From User u Where u.username=:username");
		q.setString("username", username);
		User user = (User)q.list().get(0);
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}
	
}
