package com.arrisdev.devops.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class UserTest {
	
	@Test
	void testUser() {
		
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
		use.toString();
		assertNotNull(use);
	}

}
