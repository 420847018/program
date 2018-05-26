package com.pangu.service;

import java.util.List;

import com.pangu.po.User;

public interface IUserService {

	List<User> findUserByPar(User user) ;
	
	void saveUser(User user) ;
}
