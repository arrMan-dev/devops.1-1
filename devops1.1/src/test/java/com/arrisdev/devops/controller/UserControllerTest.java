package com.arrisdev.devops.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arrisdev.devops.model.User;
import com.arrisdev.devops.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
	
	@InjectMocks
	UserController controller;
	@Mock
	UserServiceImpl impl;
	
	@Test
	void testController() {
		controller.postUser(getUserEntity());
		controller.deleteUserById(getUserEntity(), getUserEntity().getId());
		controller.getUserById(getUserEntity().getId());
	}

	private User getUserEntity() {
		User use = new User();
		use.setAge(2);
		use.setCity("califoenia");
		use.setCountry("USA");
		use.setEmail("arris@test.com");
		use.setFirstName("Arris");
		use.setGender("F");
		use.setId(1);
		use.setLastName("manduma");
		use.setPassword("React");
		use.setStatus("Active");
		return use;
	}

}
