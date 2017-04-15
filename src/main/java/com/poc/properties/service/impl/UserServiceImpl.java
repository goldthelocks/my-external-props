/**
 * 
 */
package com.poc.properties.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.properties.dao.UserDao;
import com.poc.properties.model.User;
import com.poc.properties.service.UserService;

/**
 * @author Eraine
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public void save(User user) {
		dao.save(user);
	}

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

}
