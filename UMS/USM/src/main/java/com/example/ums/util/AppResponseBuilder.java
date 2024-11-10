package com.example.ums.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AppResponseBuilder {

public<T> ResponseEntity<ResponseStructure<T>> sucess(HttpStatus status, String message, T data) {
		
		return (ResponseEntity<ResponseStructure<T>>) ResponseEntity.status(status)
				.body(ResponseStructure.create(status, message, data));
	}
}
