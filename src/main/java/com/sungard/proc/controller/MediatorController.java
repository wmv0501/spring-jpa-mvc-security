package com.sungard.proc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sungard.proc.service.UserService;

@Controller
@RequestMapping("/")
public class MediatorController {
	@Autowired
	private UserService userService;
	@RequestMapping
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping(value="/user")
	public String getUserPage( ) {
		
		
		
		return "user";
	}
	
	@RequestMapping(value="/admin")
	public String getAdminPage(Model model) {
		model.addAttribute("userList", userService.listUser());
		return "admin";
	}
}
