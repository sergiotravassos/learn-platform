package com.sergiotravassos.learnplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.learnplatform.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
