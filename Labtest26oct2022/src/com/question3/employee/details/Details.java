/*
 * program: student package
 * @author: Aarti
 * @Date: 26 oct 2022
 */
//declaring package

package com.question3.employee.details;

import java.util.Scanner;

import com.question.student.Student;
import com.question3.employee.Employee;

//declaring class
public class Details {
	//main method
	public static void main(String[] args) {
		
		//creating object of Employee class
	Employee e1= new Employee();
	Employee e2= new Employee();
	
	//creating object of Scanner
    Scanner sc = new Scanner(System.in);
	
	//declaring variables
	int id;
	String name;
	String department;
	int salary; 
	
	//taking inputs
	System.out.println("Enter the department:");
	   department=sc.nextLine();
	System.out.println("Enter the employee name:");
	   name = sc.nextLine();
   System.out.println("Enter the employee id:");
   id = sc.nextInt();
   System.out.println("Enter the salary:");
   salary = sc. nextInt();
  
   //call the method
   e1.getDetails(id, name, department, salary);
   
   
System.out.println("Enter the employee id:");
id = sc.nextInt();
System.out.println("Enter the department:");
department=sc.nextLine();
System.out.println("Enter the employee name:");
name = sc.nextLine();
System.out.println("Enter the salary:");
salary = sc. nextInt();

//call the method
e2.getDetails(id, name, department, salary);
   
   //print details
   System.out.println("-----------------------------------------------");
	e1.printDetails();
	System.out.println("-----------------------------------------------");
	e2.printDetails();
	
	
	
	}
}
//end of class