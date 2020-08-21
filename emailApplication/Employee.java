package emailApplication;

import java.util.Scanner;

public class Employee {

	private static String firstName;
	private static String lastName;
	
	public Employee(String firstName, String lastName){
		this.firstName = setFirstName();
		this.lastName = setLastName();
	}
	
	private String setFirstName(){
		Scanner s = new Scanner(System.in);
		String firstName = s.next();
		
		return firstName;
	}
	
	private String setLastName(){
		Scanner s = new Scanner(System.in);
		String lastName = s.next();
		
		return lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
}
