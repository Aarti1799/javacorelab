/*
 * program: student package
 * @author: Aarti
 * @Date: 26 oct 2022
 */
//declaring package
package com.question.student;

//declaring a class
public class Student {
	
	//instance variables
		String sname;
		int Totalclasses;
		int attendedclass;
		
		//method to get the details
		public void getDetails(String name,int Total,int attendence)
		{
			sname = name ;
			Totalclasses = Total;
			attendedclass = attendence;
			
		}
		
		//method for printing details
		public void printDetails()
		 {
			 System.out.println("Student name:"+sname);
			 System.out.println("Number of classes held:"+Totalclasses);
			 System.out.println("Number of classes attended:"+attendedclass);
			 
			
		 }
		
		 

	}//end of class



