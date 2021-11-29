package com.revature.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import com.revature.travelapp.entity.User;
import com.revature.travelapp.repository.UserRepository;
import com.revature.travelapp.service.UserService;

@RunWith(JUnit4.class)
public class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	private User user;
	private User user2;
	private UserService userService;

	@Before
	public void setup() throws Exception {
		userService = new UserService();
		userRepository = mock(UserRepository.class);
		userService.setReviewRepository(userRepository);
		;
		user = new User();
		user.setId(1);
		user.setEmail("abc@gmail.com");
		user.setPassword("xxx");

		user2 = new User();
		user2.setId(null);

		when(userRepository.save(user)).thenReturn(user);
		when(userRepository.save(user2)).thenReturn(null);

	}

	@Test
	public void testValidCreateUser() {
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.createUser(user));
	}

	@Test
	public void testInvalidCreateUser() {
		assertEquals(null, userService.createUser(user2));
	}

	@Test
	public void testValidLoginUser() {
		when(userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword())).thenReturn(user);
		assertEquals(user, userService.loginUser(user));
	}

	@Test
	public void testInvalidLoginUser() {
		assertEquals(null, userService.loginUser(user2));
	}

//	@Test
//	public void testValidFindOne() {
//		assertEquals(user, userService.findOne(1));
//	}
//
//	@Test
//	public void testInValidFindOne() {
//		assertEquals(null, userService.findOne(null));
//	}

}
