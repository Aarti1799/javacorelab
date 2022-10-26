package com.question3.employee;

public class Employee {
	int id;
	String name;
	String department;
	int salary;
	
	
	public void getDetails(int Id,String n,String dept,int slry)
	{
		Id = id;
		n = name ;
		dept = department;
		slry = salary;
		
	}
	public void printDetails()
	 {
		 System.out.println("employee id is:"+id);
		 System.out.println("employee name is:"+name);
		 System.out.println("department is:"+department);
		 System.out.println("salary is:"+salary);
		 
}
}