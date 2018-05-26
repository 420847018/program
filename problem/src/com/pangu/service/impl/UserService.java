package com.pangu.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pangu.dao.IUserDao;
import com.pangu.po.User;
import com.pangu.service.IUserService;

@Service("userService")
public class UserService implements IUserService{

	@Autowired
	private IUserDao userDao;

	public List<User> findUserByPar(User user) {
		return userDao.findUserByPar(user);
	}
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

}
