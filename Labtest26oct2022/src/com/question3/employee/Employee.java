/*
 * program: student package
 * @author: Aarti
 * @Date: 26 oct 2022
 */

//declaring package
package com.question3.employee;
//declaring class
public class Employee {
	
	//declaring variables
	int id;
	String name;
	String department;
	int salary;
	
	//taking method for get details
	public void getDetails(int Id,String n,String dept,int slry)
	{
		//instance variables
		id = Id;
		name = n ;
		department = dept;
		salary = slry;
		
	}
	//taking method for print details
	public void printDetails()
	 {
		 System.out.println("employee id is:"+id);
		 System.out.println("employee name is:"+name);
		 System.out.println("department is:"+department);
		 System.out.println("salary is:"+salary);
		 
}
}//end of class