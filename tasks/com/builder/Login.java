package com.builder;

public class Login {
	
	private String login;
	private String password;
	private Long timestamp;

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Login [login = " + login + ", password = " + password + ", timestamp = " + timestamp + "]";
	}

}
