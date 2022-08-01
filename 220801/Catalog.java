package com.ezdesign.project2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Catalog {

	protected final LinkedList<LibraryItem> libraryitem;

	public Catalog() {
		this.libraryitem = new LinkedList<LibraryItem>();
	}
	
	public void showLibraryItem() {
		
	}
	
	public void searchByTitle() {
		
	}
	
	public void searchBySubject() {
		
	}
	
	public void searchByContributor() {
		
	}
	
	public void registerLibraryItem(String category) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a title: ");
		String title1 = sc.next();
		System.out.println("Enter a subject: ");
		String subject1 = sc.next();
		System.out.println("Enter a UPC: ");
		String UPC1 = sc.next();
		
		if (category.equals("book")) {
			ArrayList<String> author = new ArrayList<String>();
			
			System.out.println("Enter the contributor number: ");
			String num = sc.next();
			int numInt = Integer.parseInt(num);
			
			for (int i=0; i<numInt; i++) {
				System.out.println("Enter the name of the Author: ");
				String name1 = sc.next();
				author.add(name1);
			}
				System.out.println(author);
		
		System.out.println("Enter the ISBN: ");
		String isbn = sc.next();
		System.out.println("Enter the DDS number: ");
		String dds = sc.next();
		
		Book book = new Book(title1, UPC1, subject1, author, isbn, dds);
		libraryitem.add(book);
			
		}
		
		
	}
	
	public void unregisterLibraryItem() {
		
	}
	
	public void modifyLibraryItem() {
		
	}
}

