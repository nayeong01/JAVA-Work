package com.ezdesign.project2;

import java.util.Scanner;

public class Menu {
	
	public Catalog catalog;
	
	private static final int SHOW_LIBRARY_ITEM = 1;
	private static final int SEARCH_BY_TITLE = 2;
	private static final int SEARCH_BY_SUBJECT = 3;
	private static final int SEARCH_BY_CONTRIBUTOR = 4;
	private static final int REGISTER_LIBRARY_ITEM = 5;
	private static final int UNREGISTER_LIBRARY = 6;
	private static final int MODIFY_LIBRARY_ITEM = 7;
	private static final int QUIT = 8;
	
	public Menu() {
		this.catalog = new Catalog();
	}
	
	private int displayMainMenu() {
		 System.out.println("1 - SHOW_LIBRARY_ITEM");
		 System.out.println("2 - SEARCH_BY_TITLE");
		 System.out.println("3 - SEARCH_BY_SUBJECT");
		 System.out.println("4 - SEARCH_BY_CONTRIBUTOR");
		 System.out.println("5 - REGISTER_LIBRARY_ITEM");
		 System.out.println("6 - UNREGISTER_LIBRARY");
		 System.out.println("7 - MODIFY_LIBRARY_ITEM");
		 System.out.println("8 - QUIT");
	     System.out.println("Enter a choice: ");
		 return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		boolean test = true;
		
		while (test) {
			int menuSelection = menu.displayMainMenu();
			Scanner sc = new Scanner(System.in);
			
			switch(menuSelection){
				case SHOW_LIBRARY_ITEM:
					break;
				case SEARCH_BY_TITLE:
					break;
				case SEARCH_BY_SUBJECT:
					break;
				case SEARCH_BY_CONTRIBUTOR:
					break;
				case REGISTER_LIBRARY_ITEM:
					
					System.out.println("Enter a category: ");
					String category = sc.next();
					menu.catalog.registerLibraryItem(category);
					
					break;
				case UNREGISTER_LIBRARY:
					break;
				case MODIFY_LIBRARY_ITEM:
					break;
				case QUIT:
					System.out.println("이용해주셔서 감사합니다.");
					test = false;
			
			}
		}
	}
}

