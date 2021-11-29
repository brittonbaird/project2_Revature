package com.revature.travelapp.service;

/**
 * 
 * Service class for
 * user login and registration
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.travelapp.entity.User;
import com.revature.travelapp.repository.UserRepository;

@Service
public class UserService {

	UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserService() {

	}

	public void setReviewRepository(UserRepository repository) {
		this.userRepository = repository;
	}

	public User createUser(User user) {
		user = userRepository.save(user);
		return user;
	}

	public User loginUser(User user) {
		return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}

	public User findOne(Integer userId) {
		User user = userRepository.findById(userId).get();
		return user;
	}

}