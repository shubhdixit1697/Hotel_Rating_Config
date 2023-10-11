package com.app.UserService.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super("Hotel id not found");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
