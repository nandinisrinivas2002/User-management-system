package com.example.ums.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.ums.entity.User;
import com.example.ums.repository.UserRepository;
import com.example.ums.util.AppResponseBuilder;
import com.example.ums.util.ResponseStructure;

public class UserService {
	
	private final UserRepository userRepository;
	private final AppResponseBuilder responseBuilder;
	

	public UserService(UserRepository userRepository,AppResponseBuilder responseBuilder) {
		super();
		this.userRepository = userRepository;
		this.responseBuilder=responseBuilder;
	}
	
	public ResponseEntity<ResponseStructure<User>> saveUser(User user){
		user=userRepository.save(user);
		return responseBuilder.sucess(HttpStatus.CREATED,"user Created",user);
	}
	

	

}
