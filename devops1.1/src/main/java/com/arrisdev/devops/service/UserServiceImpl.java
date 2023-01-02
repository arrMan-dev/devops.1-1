package com.arrisdev.devops.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arrisdev.devops.model.User;
import com.arrisdev.devops.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repo;

	@Override
	public User saveUser(User postUser) {
		return repo.save(postUser);
	}

	@Override
	public Long getById(Long id) {
		Optional<User> optionalUser = repo.findById(id);
		if (optionalUser.isPresent()) return id;
		else return null;
		
	}

	@Override
	public Boolean deleteById(User deletedUser, Long id) {
		Optional<User> user = repo.findById(id);
		if (user.isPresent()) {
			repo.deleteById(id);
			return true;
		}
		else return false;

	}

}
