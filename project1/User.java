package com.ezdesign.project;

import java.util.LinkedList;

public class User {
	String firstName;
	String lastName;
	String userType;
	int loginAttempts;
	
	//protected final LinkedList<User> users;
	
	public User(String firstname, String lastname, String usertype, int loginAttempts) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.loginAttempts = loginAttempts;
		
		//this.users = new LinkedList<User>();
		
	}	

	public void describeUser(String firstname, String lastname, String usertype) {
		System.out.println(firstname+lastname+"님은 "+usertype+" 입니다.");
	}
	
	public void greetUser(String firstname, String lastname) {
		System.out.println(firstname+lastname+"님, 안녕하세요! ");
	}
	
	public void resetLoginAttempts() {
		this.loginAttempts -= this.loginAttempts;
		System.out.println("로그인 시도가 리셋되었습니다.");
	}
	
	public int incrementLoginAttempts(String first, String last) {
		this.loginAttempts +=1;
		System.out.println(first+last+"님은 로그인을 "+this.loginAttempts+"회 시도하셨습니다.");	
		return loginAttempts;
	}
	
	public String getlastName() {
	    return lastName;
	    }
	
	public String getfirstName() {
	    return firstName;
	    }
}

class Admin extends User{
	
	Privileges privileges;

	public Admin(String firstname, String lastname, String usertype, int attempts) {
		super(firstname, lastname, usertype, attempts);
		
		this.privileges = new Privileges(firstname, lastname);
		
		}
	}
