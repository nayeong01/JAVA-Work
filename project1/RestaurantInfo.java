package com.ezdesign.project;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RestaurantInfo {
	
	private final List<Restaurant> restaurants;
	private List<User> users;

	public RestaurantInfo() {
		this.restaurants = new LinkedList<Restaurant>();
		this.users = new LinkedList<User>();
	}

	public void showRestaurant() {
		System.out.println("<<레스토랑 목록>>");
		for (int i=0; i<restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			System.out.println("Name: "+show.getName());
		}
	}
	
	public List<Restaurant> getRestaurants(){
		return this.restaurants;
	}
	
	
	public void registerRestaurant(String name, String type) {
		
		Restaurant it = new Restaurant(name , type);
		restaurants.add(it);
	}
	public void unregisterRestaurant(String restaurantName) {
		
		for (int i=0; i<restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			if (restaurantName.equals(show.getName())){ // string타입 비교는 equals 사용.
				restaurants.remove(i);
				System.out.println(show.getName()+"이 삭제되었습니다.");
				}
			}
		}
	
	public void searchRestaurant(String restaurantName) {

		for (int i =0; i <restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			if (restaurantName.equals(show.getName())) {
				show.describeRestaurant();
			}
		}
	}
	
	public void modifyRestaurant(String restaurantName) {
		for (int i=0; i<restaurants.size();i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			if (restaurantName.equals(show.getName())) {
			
				System.out.println("Enter the new Restaurant name: ");
				String newName= new Scanner(System.in).next();
				Restaurant restNew = new Restaurant(newName, show.cuisineType);
				restaurants.set(i, restNew);
				//리스트 내용을 변경할 땐, set을 쓰면 된다. 여기서는 아예 리스트 자체를 덮어써버렸다. 
					
				System.out.println("레스토랑 정보가 수정되었습니다.");
			}
		}
	}
	
	public void registerUser(String first, String last) {
		
		User user = new User(first, last);
		users.add(user);
		
	}
}