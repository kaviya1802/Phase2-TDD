package com.simplilearn.tdd.dev;

public class LoginClass {

	public String validLogin(String username, String password) {
		if(username.equals("admin") && password.equals("password")){
			return "Login Pass";
		}
		return "Login Fail";
	}
	public String inValidLoginUser(String username, String password) {
		return "Invalid Login as No username";
	}
	public String inValidLoginPass(String username, String password) {
		return "Invalid Login as No password";
	}
}
