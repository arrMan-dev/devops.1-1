package com.arrisdev.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arrisdev.devops.model.User;
import com.arrisdev.devops.service.UserService;

@RestController
@RequestMapping(value = "/pass")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping(value = "/post")
	public ResponseEntity<User> postUser(@RequestBody User postUser){
		return new ResponseEntity<>(service.saveUser(postUser), HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/fetch/{id}")
	public ResponseEntity<Long> getUserById(@PathVariable ("id") Long id){
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteUserById(@RequestBody User user,@PathVariable ("id") Long id){
		return new ResponseEntity<>(service.deleteById(user,id), HttpStatus.OK);
	}

}
