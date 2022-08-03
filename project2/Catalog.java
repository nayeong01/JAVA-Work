package com.ezdesign.project2;

import java.util.LinkedList;
import java.util.Scanner;

public class Catalog {

	protected final LinkedList<LibraryItem> libraryitem;

	public Catalog() {
		this.libraryitem = new LinkedList<LibraryItem>();
	}
	
	public void showLibraryItem() {
		System.out.println("------Item List------");
		for(LibraryItem item : libraryitem) {
			item.describeItem();
			for(ContributorWithType contbr : item.getContributor())	{
				contbr.describeContributor();
			}
			System.out.println("----------------------");
		}
	}

	public void searchByTitle(String title) {
		System.out.println("------Search Result------");
		for (int i =0; i <libraryitem.size(); i++) {
			LibraryItem show = libraryitem.get(i);
			if (title.equals(show.getTitle())) {
				show.describeItem();
				if(show.locate()!= null)
					System.out.println("DDS Number : "+show.locate());
				for(ContributorWithType contbr : show.getContributor())	{
					contbr.describeContributor();
				}
				System.out.println("-------------------------");
			}
		}
	}
	
	public void searchBySubject(String subject) {
		System.out.println("------Search Result------");
		for (int i =0; i <libraryitem.size(); i++) {
			LibraryItem show = libraryitem.get(i);
			if (subject.equals(show.getSubject())) {
				show.describeItem();
				if(show.locate()!= null)
					System.out.println("DDS Number : "+show.locate());
				for(ContributorWithType contbr : show.getContributor())	{
					contbr.describeContributor();
				}
				System.out.println("-------------------------");
			}
		}
	}
	
	public void searchByContributor(String conbt) {
		System.out.println("------Search Result------");
		for (LibraryItem item : libraryitem) {
			for(ContributorWithType contbr : item.getContributor())	{
				if(conbt.equals(contbr.contributor.name)) {
					item.describeItem();
					if(item.locate()!= null)
						System.out.println("DDS Number : "+item.locate());
					for(ContributorWithType contbr1 : item.getContributor()){
						contbr1.describeContributor();
					}
						System.out.println("-------------------------");
				}
			}
		}
	}
	
	public void registerLibraryItem(int category) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a title: ");
		String title1 = sc.next();
		System.out.println("Enter a subject: ");
		String subject1 = sc.next();
		
		if (category==1) {
			
			LinkedList<ContributorWithType> author = new LinkedList<ContributorWithType>();
			
			System.out.println("Enter the contributor number: ");
			String num = sc.next();
			int numInt = Integer.parseInt(num);
			
			for (int i=0; i<numInt; i++) {
				System.out.println("Enter the name of the Author: ");
				String name1 = sc.next();
				Contributor cont = new Contributor(name1);
				ContributorWithType cwp = new ContributorWithType(cont,"Author");
				author.add(cwp);
			}
		
		System.out.println("Enter the ISBN: ");
		String isbn = sc.next();
		System.out.println("Enter the DDS number: ");
		String dds = sc.next();
		
		Book book = new Book(title1, subject1, author, isbn, dds);
		libraryitem.add(book);
		System.out.println(title1+"이 정상적으로 등록되었습니다.");
		}
		
		else if (category==2) {
			LinkedList<ContributorWithType> artist = new LinkedList<ContributorWithType>();
			
			System.out.println("Enter the Artist number: ");
			String num1 = sc.next();
			int numInt1 = Integer.parseInt(num1);
			
			for (int i=0; i<numInt1; i++) {
				System.out.println("Enter the name of the Artist: ");
				String name1 = sc.next();
				Contributor cont = new Contributor(name1);
				ContributorWithType cwp = new ContributorWithType(cont,"Artist");
				artist.add(cwp);
			}
			
			System.out.println("Enter a UPC: ");
			String UPC1 = sc.next();
			
			CD cd = new CD(title1, UPC1, subject1, artist);
			libraryitem.add(cd);
			System.out.println(title1+"이 정상적으로 등록되었습니다.");
		}

		else if (category ==3) {
			LinkedList<ContributorWithType> Editer = new LinkedList<ContributorWithType>();
			
			System.out.println("Enter the Editer number: ");
			String num2 = sc.next();
			int numInt2 = Integer.parseInt(num2);
			
			for (int i=0; i<numInt2; i++) {
				System.out.println("Enter the name of the Editer: ");
				String name1 = sc.next();
				Contributor cont = new Contributor(name1);
				ContributorWithType cwp = new ContributorWithType(cont,"Editer");
				Editer.add(cwp);
			}

			System.out.println("Enter the volume: ");
			String volume = sc.next();
			System.out.println("Enter the issue: ");
			String issue = sc.next();
			
			Magazine magazine = new Magazine(title1, subject1, Editer,volume, issue);
			libraryitem.add(magazine);
			System.out.println(title1+"이 정상적으로 등록되었습니다.");
		}
		
		else if (category == 4) {
			LinkedList<ContributorWithType> DrAc = new LinkedList<ContributorWithType>();
			
			System.out.println("Enter the number of Director and Actor: ");
			String num2 = sc.next();
			int numInt2 = Integer.parseInt(num2);
			
			for (int i=0; i<numInt2; i++) {
				System.out.println("Enter the name of Director and Actor: ");
				String name1 = sc.next();
				Contributor cont = new Contributor(name1);
				ContributorWithType cwp = new ContributorWithType(cont,"Director and Actor");
				DrAc.add(cwp);
			}
			
			System.out.println("Enter the genre: ");
			String genre = sc.next();
			
			DVD dvd = new DVD(title1, subject1, DrAc, genre);
			libraryitem.add(dvd);
			System.out.println(title1+"이 정상적으로 등록되었습니다.");
		}
	}
	
	public void unregisterLibraryItem(String title) {
		
		for (int i=0; i<libraryitem.size(); i++) {
			LibraryItem show = libraryitem.get(i);
			if (title.equals(show.getTitle())){ // string타입 비교는 equals 사용.
				libraryitem.remove(i);
				System.out.println(show.getTitle()+"이 삭제되었습니다.");
				}
			}
		}
	
	public void modifyLibraryItem(String title) {
		
		for (int i=0; i<libraryitem.size();i++) {
			LibraryItem item = libraryitem.get(i);
			if (title.equals(item.getTitle())) {
				System.out.println("Enter the new item name: ");
				String newName= new Scanner(System.in).next();
				libraryitem.set(i, item.modifyItem(newName));
				//item.setTitle(title);
				System.out.println(item.getTitle()+"이 정상적으로 수정되었습니다.");
				//리스트 내용을 변경할 땐, set을 쓰면 된다. 여기서는 아예 리스트 자체를 덮어써버렸다. 
			}
		}
	}
}

