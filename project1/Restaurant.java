package com.ezdesign.project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Restaurant {
	
	protected String restaurantName;
	protected String cuisineType;
	protected int numberServed;
	
	public final List<User> users;
	
	Restaurant(String restaurantName, String cuisineType, int numberServed){
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
		this.numberServed = numberServed;
		
		this.users = new LinkedList<User>();
		
	}
	
	public void describeRestaurant() {
		System.out.println("\nName: "+this.restaurantName);
		System.out.println("Type: "+this.cuisineType);
		System.out.println("Served Number: "+this.numberServed);
	}
	
	public boolean restaurantOpen() {
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime today12pm = LocalDate.now().atTime(12,0);
		LocalDateTime today10pm = LocalDate.now().atTime(22,0);
		
		if (today12pm.isBefore(now) && today10pm.isAfter(now)) {
			System.out.println(this.restaurantName+" is open.");
			return true;
		}else
			System.out.println(this.restaurantName+" is close.");
			return false;
	}
	
	public int incrementNumberServed() {
		this.numberServed +=1;
		System.out.println("오늘 "+this.restaurantName+" 방문자 수는 "+ numberServed+"명 입니다.");
		return numberServed;
	}
	
	public void loginUser(String first, String last, String userType, int attempts) {
		
		User user = new User(first, last, userType, attempts);
		users.add(user);
		
	}
	
	public String getName() {
	    return restaurantName;
	    }
	
	/*
	public String getType() {
	    return cuisineType;
	    }
	 */
}