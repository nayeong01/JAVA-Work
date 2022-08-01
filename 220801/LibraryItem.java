package com.ezdesign.project2;

public class LibraryItem {
	
	private String title;
	private String UPC;
	private String subject;
	private String contributors;

	public LibraryItem(String title, String UPC, String subject, String contributors) {
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
		this.contributors = contributors;
	}
	
	public void locate() {
		
	}
	
	public void describeItem() {
		
	}
}

class Book extends LibraryItem{
	
	private String ISBN;
	private String title;
	private String subject;
	private String DDSNumber;
	
	public Book(String title, String UPC, String subject, String contributors
			,String ISBN, String DDSNumber) {
		super(title, UPC, subject, contributors);
		
		this.ISBN = ISBN;
		this.DDSNumber = DDSNumber;
		
	}
}

class CD extends LibraryItem{
	
	public CD(String title, String UPC, String subject, String contributors) {
		super(title, UPC, subject, contributors);
		
	}
}

class DVD extends LibraryItem{
	
	private String genre;
	
	public DVD(String title, String UPC, String subject, String contributors
			,String genre) {
		super(title, UPC, subject, contributors);
		
		this.genre = genre;
		
	}
}

class Magazine extends LibraryItem{
	
	private int volume;
	private int issue;
	
	public Magazine(String title, String UPC, String subject, String contributors
			,int volume, int issue) {
		super(title, UPC, subject, contributors);
		
		this.volume = volume;
		this.issue = issue;
	}
}