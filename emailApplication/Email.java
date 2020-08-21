package emailApplication;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity =500;
	String email;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	//Constructor for firstName & lastname
	public Email(String firstName, String lastname) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		System.out.println("Email Created for "+ this.firstName+" "+this.lastname);
		
		this.department = getDepartment();
		System.out.println("Depaartment is "+ department);
		
		this.password = randomPassword(defaultPasswordLength); 
		System.out.println("Your Password is "+ password);
		
		this.email = generateEmailId();
		System.out.println("Your mail id is "+ email);
	}


	private String getDepartment(){
		
		System.out.println("Enter the Department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none");
		
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		
		if(depChoice == 1){return "sales";}
		else if(depChoice == 2){return "dev";}
		else if(depChoice == 3){return "acc";}
		else {return "";}
		
	}
	
	//Takes a random character from a String and sets the character in a char[]
	private String randomPassword(int length){
	
		
		String passwordSet = "ABCDEFGHIJKLMNO!@#$%1234567890";
		char[] password = new char[length];
		
		for(int i=0;i<length;i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	private String generateEmailId(){
		
		String companyName = "techValley.com";
		
		return firstName.toLowerCase()+"."+lastname.toLowerCase()+"@"+ department+"."+ companyName;
		
		//return email;
	}
	
	
	public void setMailBoxCapacity(int capacity){
		this.mailboxCapacity = capacity;
		
	}
	
	public void setAlternativeEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String newPassword){
		this.password = newPassword;
	}
	
	public int getMailBoxCapacity(){
		return mailboxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String shownInfo(){
		
		return "Displaying the collected info\nDepartment: "+department+ "\nEmail: "+ email+ "\nMailBox capacity: "+mailboxCapacity+" mb";
		
	}
	
}
