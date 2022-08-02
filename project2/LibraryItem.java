package com.ezdesign.project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class LibraryItem {
	
	private String title;
	private String UPC;
	private String subject;
	private ArrayList<ContributorWithType> contributors;
	Catalog catalog;

	public LibraryItem(String title, String UPC, String subject, ArrayList<ContributorWithType> contributors) {
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
		this.contributors = contributors;
		this.catalog = new Catalog();
	}
	

	public void locate() {
		
	}
	
	public abstract void describeItem();
	
	public abstract LibraryItem modifyItem(String name);
	
	public String getTitle() {
		return title;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public ArrayList<ContributorWithType> getContributor(){
		return contributors;
	}
}

class Book extends LibraryItem{
	
	private String ISBN;
	private String title;
	private String subject;
	private String DDSNumber;
	private String UPC;
	private ArrayList<ContributorWithType> contributors;
	
	public Book(String title, String UPC, String subject, ArrayList<ContributorWithType> contributors
			,String ISBN, String DDSNumber) {
		super(title, UPC, subject, contributors);
		
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
		this.contributors = contributors;
		this.DDSNumber = DDSNumber;
		this.ISBN = ISBN;
		

	}
	
	@Override
	public void describeItem() {
		System.out.println("\nType : Book"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public Book modifyItem(String name) {
		Book newItem = new Book(name, this.UPC, this.subject, this.contributors
								,this.ISBN, this.DDSNumber);
		return newItem;
	}
}


class CD extends LibraryItem{
	
	private String title;
	private String subject;
	private ArrayList<ContributorWithType> contributors;
	private String UPC;
	
	public CD(String title, String UPC, String subject, ArrayList<ContributorWithType> contributors) {
		super(title, UPC, subject, contributors);
		
		
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
		this.contributors = contributors;
		
	}

	@Override
	public void describeItem() {
		System.out.println("\nType : CD"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public CD modifyItem(String name) {
		CD newItem = new CD(name, this.UPC,this.subject,this.contributors);
		return newItem;
	}
}

class DVD extends LibraryItem{
	
	private String genre;
	private String title;
	private String subject;
	private ArrayList<ContributorWithType> contributors;
	private String UPC;
	
	public DVD(String title, String UPC, String subject, ArrayList<ContributorWithType> contributors
			,String genre) {
		super(title, UPC, subject, contributors);
		
		
		this.title = title;
		this.subject = subject;
		this.genre = genre;
		this.contributors = contributors;
		this.UPC = UPC;
	}

	@Override
	public void describeItem() {
		System.out.println("\nType : DVD"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public DVD modifyItem(String name) {
		DVD dvd = new DVD(name, this.UPC, this.subject, this.contributors, this.genre);
		return dvd;
	}
}

class Magazine extends LibraryItem{
	
	private String volume;
	private String issue;
	private String title;
	private String subject;
	private ArrayList<ContributorWithType> contributors;
	private String UPC;
	
	public Magazine(String title, String UPC, String subject, ArrayList<ContributorWithType> contributors
			,String volume, String issue) {
		super(title, UPC, subject, contributors);
		
		this.volume = volume;
		this.issue = issue;
		this.title = title;
		this.subject = subject;
		this.contributors = contributors;
		this.UPC = UPC;
	}

	@Override
	public void describeItem() {
		System.out.println("\nType : DVD"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public Magazine modifyItem(String name) {
		Magazine maga = new Magazine(name, this.UPC, this.subject, this.contributors, this.volume, this.issue);
		return maga;
		}
	}
