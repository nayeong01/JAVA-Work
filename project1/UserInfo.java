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
	}
	
	public void loginAttempts(String first, String last,String userType, int attempts) {
		
		for (int i=0; i<users.size(); i++) {
			User show = (User) users.get(i);
			if (last.equals(show.getlastName())){
				show.incrementLoginAttempts(first, last);
				
			}else
				System.out.println(first+last+"님은 신규회원입니다.");
		}
	}
}


