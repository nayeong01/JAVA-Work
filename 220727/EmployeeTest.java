package com.ezdesign.task1;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeTest {
	
	private LinkedList employees ;
	
	public EmployeeTest() {
		this.employees = new LinkedList();
	}
	
	public static void main(String[] args) {

		EmployeeTest empTest = new EmployeeTest();

		Clerk clrk = new Clerk("Susan", 40);
		FulltimeManager fulMgr = new FulltimeManager("Bob", 45);

		empTest.employees.add(clrk);
		empTest.employees.add(fulMgr);
		
		//Collections.sort(empTest.employees);

		Employee emp1 = (Employee) empTest.employees.get(0);
		Employee emp2 = (Employee) empTest.employees.get(1);
		
		
		
		System.out.println("\nName: " + emp1.getName() + "\nSalary: " + emp1.getSalary());
		System.out.println("\nName: " + emp2.getName() + "\nSalary: " + emp2.getSalary());
	}
}