package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
	@Query("select u from user u where u.email = :email")
	public User findUserByUsername(@Param("email") String email); 
		
}