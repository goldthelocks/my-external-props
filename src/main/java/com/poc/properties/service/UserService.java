/**
 * 
 */
package com.poc.properties.service;

import java.util.List;

import com.poc.properties.model.User;

/**
 * @author Eraine
 *
 */
public interface UserService {

	void save(User user);
	
	List<User> findAll();

}
