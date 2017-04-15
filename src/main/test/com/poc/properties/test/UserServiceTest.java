/**
 * 
 */
package com.poc.properties.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poc.properties.model.User;
import com.poc.properties.service.UserService;

/**
 * @author Eraine
 *
 */
public class UserServiceTest {

	private ApplicationContext applicationContext;
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		userService = (UserService) applicationContext.getBean("userServiceImpl");
	}

	@Test
	public void testFindAll() {
		List<User> userList = userService.findAll();
		
		for (User u : userList) {
			System.out.println(u.toString());
		}
	}
	
	public void test() {
		User user = new User();
		user.setName("eraine");
		
		userService.save(user);
	}
}