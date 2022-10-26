package com.question.student.test;

import java.util.Scanner;

import com.question.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1= new Student();
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Totalclasses; 
		
		
		System.out.println("Enter the Student name:");
		name = sc.nextLine();
		System.out.println("Enter the total number of classes held :");
		 Totalclasses = sc.nextInt();
		System.out.println("Enter the number of attended class:");
		 int attendedclass = sc.nextInt();
				
				s1.getDetails(name, Totalclasses, attendedclass);
		System.out.println("-----------------------------------------------");
		
		s1.printDetails();
		
		if(attendedclass>=75)
		{
			System.out.print("you are eligible for exam");
		}
		
			else
			{
				System.out.print("you are noy eligible for exam because your attendence is low");
		}
	}

}
