package studentDB;

import java.util.Scanner;

public class StudentDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number of students: ");
		Scanner s = new Scanner(System.in);
		
		int numberOfStudents = s.nextInt();
		
		Student[] students = new Student[numberOfStudents];
		
		for(int n=0;n<numberOfStudents;n++){
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].toString());
		}
	}

}
