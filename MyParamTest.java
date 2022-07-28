package com.ezdesign.task2;

public class MyParamTest {

	public static void main(String[] args) {
		
		MyValue myVal;
		myVal = () -> 98.6;

		System.out.println("Reciprocal of 4 is " + myVal.getValue());
		
		
		MyParamValue myPval =(n)->1.0/n;
		System.out.println("Reciprocal of 4 is "+ myPval.getValue(4.0));
		(double n)->1.0/n;
		(var n)->1.0/n;
	
	}
}
