package com.example.demo_maven_app.controller;

import com.example.demo_maven_app.configuration.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
class Controller {

	@Autowired
	public UserData user;

	@GetMapping("/user")
	public String getUser() {
		System.out.println(user.getFirstName());
		return user.getFirstName();
	}
}
