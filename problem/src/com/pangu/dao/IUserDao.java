package com.pangu.dao;

import java.util.List;

import com.pangu.po.User;

public interface IUserDao {

	 List<User> findUserByPar(User user);
	 
	 int findUserCountByPar(User user);
	 
	 User findUserById(Long id);
	 
	 void saveUser(User user);
	 
	 int updateUser(User user);
	 
	 int deleteUserById(Long id);
	 
}

