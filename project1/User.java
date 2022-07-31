package project;

public class User {
	private String firstName;
	private String lastName;
	private String userType;

	public User(String firstname, String lastname, String usertype) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		
	}	

	public void describeUser(String firstname, String lastname, String usertype) {
		System.out.println(firstname+lastname+"¥‘¿∫ "+usertype+"¿‘¥œ¥Ÿ.");
	}
	
	public void greetUser(String firstname, String lastname, String usertype) {
		System.out.println(firstname+lastname+"¥‘, æ»≥Á«œººø‰!");
	}
}

class Admin extends User{
	
	Privileges privileges;

	public Admin(String firstname, String lastname, String usertype) {
		super(firstname, lastname, usertype);
		
		this.privileges = new Privileges(firstname, lastname);
		
		}
	}
