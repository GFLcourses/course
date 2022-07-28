package com.builder;

public class BuilderApp {
	
	public static void main(String[] args) {
		Login login = new LoginBuilder()
			.buildLogin("student")
			.buildPassword("123")
			.build();
		System.out.println(login);
	}
}
