package project;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RestaurantInfo {
	
	protected final List<Restaurant> restaurants;

	public RestaurantInfo() {
		this.restaurants = new LinkedList<Restaurant>();
	}

	/*
	public void showRestaurant() {
		System.out.println("<<������� ���>>");
		for (int i=0; i<restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			System.out.println("Name: "+show.getName());
		}
	}
	*/
	
	public List<Restaurant> getRestaurants(){
		return this.restaurants;
	}
	
	public void registerRestaurant(String restaurantName, String cuisineType) {
		
		Restaurant it = new Restaurant(restaurantName, cuisineType);
		restaurants.add(it);
	}

	public void unregisterRestaurant(String restaurantName) {
		
		for (int i=0; i<restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			if (restaurantName.equals(show.getName())){ // string Ÿ������ �������°� �ƴѰ�? �� �ɸ��� ����?
				restaurants.remove(i);
				System.out.println(show.getName()+"�� �����Ǿ����ϴ�.");
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
			
				//if (restaurant != null) { 
					System.out.println("Enter the new Restaurant name: ");
					String newName= new Scanner(System.in).next();
					Restaurant restNew = new Restaurant(newName, show.cuisineType);
					restaurants.set(i, restNew);
					//restaurant = new Restaurant(newName,w.getType());// �̸��� ��� ��������?
					
					System.out.println("�̸��� ����Ǿ����ϴ�.");
				//}
			}	
		}
	}
	
	public void loginUser(String restaurantName, String userType) {
		for (int i =0; i <restaurants.size(); i++) {
			Restaurant show = (Restaurant) restaurants.get(i);
			
			if (restaurantName.equals(show.getName())) {
				Scanner sc = new Scanner(System.in);
		
				if(show.restaurantOpen() == true) { 
					System.out.println("First name: ");
					String first= sc.next();
					System.out.println("Last name: ");
					String last= sc.next();

					User user = new User(first, last, userType);
					user.describeUser(first, last, userType);
					user.greetUser(first, last, userType);
				}else
					System.out.println("�Ĵ� ������ ����Ǿ����ϴ�.");
				
			}
		}
	}
}