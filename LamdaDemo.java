package com.ezdesign.task2;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyValue myVal;
		myVal = () -> 98.6;
	    System.out.println("A constant value: " + myVal.getValue()); 

	    MyParamValue MyPval = (n) -> 1.0/n;
	    System.out.println("Reciprocal of 4 is " + MyPval.getValue(4.0));     
	    System.out.println("Reciprocal of 8 is " + MyPval.getValue(8.0));     
	}
}
