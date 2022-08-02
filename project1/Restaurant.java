package com.ezdesign.project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Restaurant {
	
	protected String restaurantName;
	protected String cuisineType;
	protected int numberServed;
	
	private final List<User> users;
	
	Restaurant(String restaurantName, String cuisineType){
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
		//this.numberServed = numberServed;
		
		this.users = new LinkedList<User>();
		
	}
	
	public List<User> getUsers() {
		return this.users;
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
	
	public String getName() {
	    return restaurantName;
	    }
	
	/*
	public String getType() {
	    return cuisineType;
	    }
	 */
}