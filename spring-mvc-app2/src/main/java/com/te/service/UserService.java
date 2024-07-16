package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.UserDAO;
import com.te.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO dao;
	
	
	public int createUser(User user) {
		return this.dao.saveUser(user);
		
	}

}
