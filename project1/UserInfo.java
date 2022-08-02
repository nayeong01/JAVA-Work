package com.ezdesign.project;

import java.util.LinkedList;
import java.util.List;

public class UserInfo {

	public final List<User> users;

	public UserInfo() {
		this.users = new LinkedList<User>();

		
	}
	
	public void registerUser(String first, String last, String userType, int attempts) {
		
		User user = new User(first, last, userType, attempts);
		users.add(user);
		System.out.println(user.getlastName());
	}
	
	public void loginAttempts(String first, String last,String userType, int attempts) {

	}
}


