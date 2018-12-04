package com.spring;

public class CustomNotFoundException extends RuntimeException {

	public CustomNotFoundException(String msg) {
		super(msg);
	}
}