package com.app.UserService.Exception;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException() {
		super("This User is not present on server");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
