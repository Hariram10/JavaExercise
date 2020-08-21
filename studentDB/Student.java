package studentDB;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private static String studentId;
	private String courses = "";
	private int courseCost = 1000;
	private int tutionBalance = 0;
	private int id = 1000;
	
	public Student(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter student's first name:");
		this.firstName = s.next();
		
		System.out.println("Enter student's last name:");
		this.lastName = s.next();
		
		System.out.println("Enter the grade year of the student");
		this.gradeYear = s.nextInt();
		
		setId();

		System.out.println(firstName +" "+ lastName + " " + gradeYear+ " "+ studentId);
		
		
	}
	
	private String setId(){
		id++;
		return this.studentId = gradeYear + "" + id;
	}
	
	public void enroll(){
		//System.out.println(courses);
		do{
			System.out.print("Enter the course to enroll & Q to quit: ");
			Scanner s = new Scanner(System.in);
			String course = s.next();
			if(!course.equals("Q")){
				courses  =  courses + "\n" + course;
				//System.out.println(courses);
				tutionBalance = tutionBalance+courseCost;
			}else{
				break;
			}
		}while(1!=0);
		
		//System.out.println("Courses Enrolled: "+ courses);
		//System.out.println("Tution Balance: "+ tutionBalance);
	}
	
	public void viewBalance(){
		System.out.println("Your balance is: "+ tutionBalance);
	}
	
	public void payTution(){
		viewBalance();
		System.out.println("Enter your payment amount: ");
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for the payment of Rs. "+ payment);
		viewBalance();
	}

	@Override
	public String toString() {
		return "FirstName=" + firstName + ", LastName=" + lastName + ", GradeYear=" + gradeYear + ", Courses="
				+ courses + ", CourseCost=" + courseCost + ", TutionBalance=" + tutionBalance + "]";
	}
	
	
	
}
