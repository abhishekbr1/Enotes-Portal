package com.sellopy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sellopy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

		public boolean existsByEmail(String user);
		
		public User findByEmail(String email);
}
