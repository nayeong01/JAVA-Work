package com.ezdesign.project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Restaurant {
	
	protected String restaurantName;
	protected String cuisineType;
	
	Restaurant(String restaurantName, String cuisineType){
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
	}
	
	public void describeRestaurant() {
		System.out.println("Name: "+this.restaurantName);
		System.out.println("Type: "+this.cuisineType);
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
	
	public String getName() {
	    return restaurantName;
	    }

	public String getType() {
	    return cuisineType;
	    }

	
	
}
