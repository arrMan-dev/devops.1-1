package com.arrisdev.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arrisdev.devops.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
