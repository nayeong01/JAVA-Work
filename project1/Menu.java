package com.ezdesign.project;

import java.util.Scanner;

public class Menu {

	public RestaurantInfo restaurantInfo;
	
	private static final int SHOW_RESTAURANT = 1;
	private static final int SEARCH_RESTAURANT = 2;
	private static final int REGISTER_RESTAURANT = 3;
	private static final int UNREGISTER_RESTAURANT = 4;
	private static final int LOGIN_USER = 5;
	private static final int MODIFY_RESTAURANT = 6;
	private static final int QUIT = 7;

	public Menu() {
		this.restaurantInfo = new RestaurantInfo();
	}
	
	private int displayMainMenu() {
	      System.out.println("1 - SHOW_RESTAURANT");
	      System.out.println("2 - SEARCH_RESTAURANT");
	      System.out.println("3 - REGISTER_RESTAURANT");
	      System.out.println("4 - UNREGISTER_RESTAURANT");
	      System.out.println("5 - LOGIN_USER");
	      System.out.println("6 - MODIFY_RESTAURANT");
	      System.out.println("7 - QUIT\n");
	      System.out.println("Enter a choice: ");
	      return new Scanner(System.in).nextInt();
	}
	 
	public void showRestaurants() {
		this.restaurantInfo.getRestaurants().forEach(restaurant -> restaurant.describeRestaurant());
	}  // for문 대신 람다식으로 만든 레스토랑 보여주기 코드. forEach를 사용한다.
	
	public void loginUser() {
		
	}
	 
	 public static void main(String[] args) {
		 Menu menu = new Menu();
		 boolean test = true;
		 
		 while(test) {
			 
		  int menuSelection =  menu.displayMainMenu();
		  Scanner sc = new Scanner(System.in);
		  
		  switch(menuSelection) {
			  case SHOW_RESTAURANT:
				  menu.showRestaurants();
				  break;
				  
			  case SEARCH_RESTAURANT:
				  System.out.println("Enter the restaurant name: ");
				  String name = sc.next();
				  menu.restaurantInfo.searchRestaurant(name);
				  break;
				  
			  case REGISTER_RESTAURANT:
				  System.out.println("Enter the restaurant name: ");
				  String name1 = sc.next();
				  System.out.println("Enter the cusinetype: ");
				  String type = sc.next();
				  int numberServed = 0;
				  menu.restaurantInfo.registerRestaurant(name1, type, numberServed);
				  break;
				  
			  case UNREGISTER_RESTAURANT:
				  System.out.println("Enter the restaurant name: ");
				  String name2 = sc.next();
				  menu.restaurantInfo.unregisterRestaurant(name2);
				  break;
				  
			  case LOGIN_USER:
				  System.out.println("User or Admin? ");
				  String usertype = sc.next();
				  
				  if (usertype.equals("user")) {
					  menu.showRestaurants();  
					  System.out.println("Enter the restaurant name: ");
					  String name3 = sc.next();
					  menu.restaurantInfo.loginUser(name3, usertype);
					  break;
				  
				  } else {
					  System.out.println("Enter your first name: ");
					  String first = sc.next();
					  System.out.println("Enter your last name: ");
					  String last = sc.next();
					  int attempts =0;
					  
					  Admin admin = new Admin(first, last, usertype, attempts);
					  admin.privileges.showPrivileges(first, last);
					  // Admin 클래스에 있는 privileges를 불러오고, 그 클래스에 있는 메서드를 호출한다. 
					  break;
				  }
				  
			  case MODIFY_RESTAURANT:
				  System.out.println("Enter the restaurant name: ");
				  String name4 = sc.next();
				  menu.restaurantInfo.modifyRestaurant(name4);
				  break;
				  
			  case QUIT:
				  System.out.println("이용해주셔서 감사합니다.");
				  test = false; 
		  	}
		  
		 }
	 }
}
