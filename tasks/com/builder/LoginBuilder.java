package com.builder;

public class LoginBuilder {
	private String l = "login";
	private String p = "password";
	private Long t = 100L;

	public LoginBuilder buildLogin(String l) {
		this.l = l;
		return this;
	}

	public LoginBuilder buildPassword(String p) {
		this.p = p;
		return this;
	}

	public LoginBuilder buildTimestamp(Long t) {
		this.t = t;
		return this;
	}

	public Login build() {
		Login login = new Login();
		login.setLogin(l);
		login.setPassword(p);
		login.setTimestamp(t);
		return login;
	}


}
