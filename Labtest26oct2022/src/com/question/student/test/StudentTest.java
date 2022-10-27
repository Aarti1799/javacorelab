/*
 * program: student package
 * @author: Aarti
 * @Date: 26 oct 2022
 */

//declaring package
package com.question.student.test;

import java.util.Scanner;

import com.question.student.Student;

//declaring a class
public class StudentTest {
	//main method
	public static void main(String[] args) {
		
		//creating object of student class
		Student s1= new Student();
		
		//declaring an object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		String name;
		int Totalclasses; 
		
		//taking inputs
		System.out.println("Enter the Student name:");
		name = sc.nextLine();
		System.out.println("Enter the total number of classes held :");
		 Totalclasses = sc.nextInt();
		System.out.println("Enter the number of attended class:");
		 int attendedclass = sc.nextInt();
				
		 //call the method getdetails
				s1.getDetails(name, Totalclasses,   attendedclass);
				
				
				//printdetails
		System.out.println("-----------------------------------------------");
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
      }//end of main

}//end of class
