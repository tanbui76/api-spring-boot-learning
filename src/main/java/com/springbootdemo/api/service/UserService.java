package com.springbootdemo.api.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootdemo.api.dto.LoginDTO;
import com.springbootdemo.api.dto.UserDTO;
import com.springbootdemo.api.entity.User;
import com.springbootdemo.api.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public User createUser(UserDTO user) {
		if (userRepository.findByEmail(user.getEmail()) != null) {
			throw new IllegalArgumentException("Email exist!");
		}
		String hashPassword = passwordEncoder.encode(user.getPassword());
		User data = new User(user.getName(), user.getEmail(), hashPassword);
		return userRepository.save(data);
	}

	public User loginUser(LoginDTO data) {
		 User user = userRepository.findByEmail(data.getEmail());
	        if (user == null || !passwordEncoder.matches(data.getPassword(), user.getPassword())) {
	            throw new UsernameNotFoundException("Invalid email or password");
	        }
	        return user;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public User updateUser(Long id, User user) {
		user.setId(id);
		String hashPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(hashPassword);
		return userRepository.save(user);
	}

	public User deleteUser(Long id) {
		userRepository.deleteById(id);
		return userRepository.findById(id).orElse(null);
	}
}
