package emailApplication;

import java.util.Scanner;

public class EmailApp {

	private static String firstName;
	private static String lastName;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Welcome dear fresher!\nPlease provide your Firstname & Lastname to genrate mail id & password");
		
		Employee employee = new Employee(firstName, lastName);
	
		firstName = employee.getFirstName();
		lastName = employee.getLastName();
		
		Email email1 = new Email(firstName, lastName);
		System.out.println("==========");

		System.out.println(email1.shownInfo());
	}

}
