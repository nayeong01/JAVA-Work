package com.ezdesign.project2;

public class ContributorWithType {
	Contributor contributor;
	String type;
	
	public ContributorWithType(Contributor contributor, String type) {
		this.contributor = contributor;
		this.type = type;
	}
	
	public void describeContributor() {
		System.out.println(this.type+ " : "+ this.contributor.name);
		}
	
	public Contributor getContr() {
		return contributor;
	}
	}

