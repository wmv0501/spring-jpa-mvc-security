package com.sungard.proc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sungard.proc.domain.User;
import com.sungard.proc.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
    public static final String COLLECTION_NAME = "user";

	  public List<User> listUser() {
	        return userRepository.findAll();
	    }
}
