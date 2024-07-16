package com.te.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.te.model.User;

@Repository
public class UserDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
	Integer id = (Integer) this.hibernateTemplate.save(user);
	return id;
		
	}

}
