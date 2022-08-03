package com.ezdesign.project2;
	
import java.util.LinkedList;
	
public abstract class LibraryItem {
	
	private String title;
	private String subject;
	private LinkedList<ContributorWithType> contributors;
	Catalog catalog;
	
	public LibraryItem(String title,String subject, LinkedList<ContributorWithType> contributors) {
		
		this.title = title;
		this.subject = subject;
		this.contributors = contributors;
		this.catalog = new Catalog();
		
	}
	
	public abstract String locate(); //dds넘버를 리턴할 수 있게 한다.
		
	public abstract void describeItem();
	
	public abstract LibraryItem modifyItem(String name);
	
	public void setTitle(String title1) {
		this.title = title1;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public LinkedList<ContributorWithType> getContributor(){
		return contributors;
	}
}

class Book extends LibraryItem{
	
	private String ISBN;
	private String title;
	private String subject;
	private String DDSNumber;
	private LinkedList<ContributorWithType> contributors;
	
	public Book(String title, String subject, LinkedList<ContributorWithType> contributors
			,String ISBN, String DDSNumber) {
		super(title,subject, contributors);
		
		this.title = title;
		this.subject = subject;
		this.contributors = contributors;
		this.DDSNumber = DDSNumber;
		this.ISBN = ISBN;
		
	}
	
	@Override
	public void describeItem() {
		System.out.println("Type : Book"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
	}
	
	@Override
	public Book modifyItem(String name) {
		Book newItem = new Book(name, this.subject, this.contributors
								,this.ISBN, this.DDSNumber);
		return newItem;
	}
	
	@Override
	public String locate() {
		return DDSNumber;
	}
}

class CD extends LibraryItem{
	
	private String title;
	private String subject;
	private LinkedList<ContributorWithType> contributors;
	private String UPC;
	
	public CD(String title, String UPC, String subject, LinkedList<ContributorWithType> contributors) {
		super(title, subject, contributors);
		
		
		this.title = title;
		this.UPC = UPC;
		this.subject = subject;
		this.contributors = contributors;
		
	}

	@Override
	public void describeItem() {
		System.out.println("Type : CD"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
	}

	@Override
	public CD modifyItem(String name) {
		CD newItem = new CD(name, this.UPC,this.subject,this.contributors);
		return newItem;
	}

	@Override
	public String locate() {
		return null;
	}
}

class DVD extends LibraryItem{
	
	private String genre;
	private String title;
	private String subject;
	private LinkedList<ContributorWithType> contributors;

	
	public DVD(String title, String subject, LinkedList<ContributorWithType> contributors
			,String genre) {
		super(title, subject, contributors);
		
		
		this.title = title;
		this.subject = subject;
		this.genre = genre;
		this.contributors = contributors;

	}

	@Override
	public void describeItem() {
		System.out.println("Type : DVD"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public DVD modifyItem(String name) {
		DVD dvd = new DVD(name, this.subject, this.contributors, this.genre);
		return dvd;
	}

	@Override
	public String locate() {
		return null;
	}
}

class Magazine extends LibraryItem{
	
	private String volume;
	private String issue;
	private String title;
	private String subject;
	private LinkedList<ContributorWithType> contributors;
	
	public Magazine(String title, String subject, LinkedList<ContributorWithType> contributors
			,String volume, String issue) {
		super(title, subject, contributors);
		
		this.volume = volume;
		this.issue = issue;
		this.title = title;
		this.subject = subject;
		this.contributors = contributors;
	}

	@Override
	public void describeItem() {
		System.out.println("Type : Magazine"+
						   "\nTitle : "+this.title+
						   "\nsubject : "+this.subject);
		
	}

	@Override
	public Magazine modifyItem(String name) {
		Magazine maga = new Magazine(name, this.subject, this.contributors, this.volume, this.issue);
		return maga;
		}

	@Override
	public String locate() {
		return null;
	}
}
