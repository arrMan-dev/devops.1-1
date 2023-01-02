package com.arrisdev.devops.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.arrisdev.devops.model.User;
import com.arrisdev.devops.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
	
	@Mock
	UserRepository repo;
	@InjectMocks
	UserServiceImpl impl;
	
	@Test
	void testServiceImpl() {
		impl.saveUser(getUserEntity());
		impl.getById(getUserEntity().getId());
		impl.deleteById(getUserEntity(), getUserEntity().getId());
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
