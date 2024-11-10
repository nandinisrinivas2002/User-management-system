package com.example.ums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ums.entity.User;
import com.example.ums.service.UserService;
import com.example.ums.util.ResponseStructure;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

    @PostMapping("/save")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return userService.saveUser(user);
		
	}

}
