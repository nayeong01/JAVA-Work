package com.ezdesign.project;

public class User {
	private String firstName;
	private String lastName;
	private int loginAttempt;
	private String userType;

	public User() {
	
		//this.firstName = firstName;
		//this.lastName = lastName;
		//this.userType = userType;
	}	

	public void describeUser(String firstname, String lastname, String usertype) {
		System.out.println(firstname+lastname+"님은 "+usertype+"입니다.");
	}
	
	public void greetUser(String firstname, String lastname, String usertype) {
		System.out.println(firstname+lastname+"님, 안녕하세요!");
	}

}
