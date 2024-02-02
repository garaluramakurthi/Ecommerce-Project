package com.naveen.emart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.emart.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	 Optional<User> findUserByEmail(String email);
}
