package com.arrisdev.devops.service;

import java.util.Optional;

import com.arrisdev.devops.model.User;

public interface UserService {

	User saveUser(User postUser);

	Long getById(Long id);

	Boolean deleteById(User user, Long id);

}
