package com.question3.employee.details;

import java.util.Scanner;

import com.question.student.Student;
import com.question3.employee.Employee;

public class Details {
	public static void main(String[] args) {
	Employee e1= new Employee();
	Scanner sc = new Scanner(System.in);
	
	int id;
	String name;
	String department;
	int salary; 
	
	
	System.out.println("Enter the department:");
	   department=sc.nextLine();
	System.out.println("Enter the employee name:");
	   name = sc.nextLine();
   System.out.println("Enter the employee id:");
   id = sc.nextInt();
   System.out.println("Enter the salary:");
   salary = sc. nextInt();
  
   e1.getDetails(id, name, department, salary);
   System.out.println("-----------------------------------------------");
	e1.printDetails();
	
	
	}
}
