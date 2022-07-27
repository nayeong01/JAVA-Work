package com.ezdesign.task1;

import java.util.LinkedList;


public class Employee {
    protected String name;
    protected int salary;
    protected int workHoursPerWeek;
    
    public Employee(String name, int workHoursPerWeek) {
    	this.name = name;
    	this.workHoursPerWeek = workHoursPerWeek;
    	this.salary = calcSalary(workHoursPerWeek);
    }
    
    private int calcSalary(int workHoursPerWeek) {
    	
    	int calSal = 0;
    	
    	calSal = workHoursPerWeek * 10000;
    	
    	return calSal;
    }
    
    public int getSalary() {
    	return this.salary;
    }
    
	
	public String getName() {
		return this.name;
	}
	
}

class Clerk extends Employee {
	
	public Clerk(String name, int workHoursPerWeek) {
		super(name, workHoursPerWeek);
	}
	
}

class Manager extends Employee {
	public Manager(String name, int workHoursPerWeek) {
		super(name, workHoursPerWeek);
	}
}

class FulltimeManager extends Manager {
	public FulltimeManager(String name, int workHoursPerWeek) {
		super(name, workHoursPerWeek);
	}
}
