package com.sungard.proc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sungard.proc.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
