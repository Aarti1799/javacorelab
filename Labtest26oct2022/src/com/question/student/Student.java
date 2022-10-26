package com.question.student;

public class Student {
	
		String sname;
		int Totalclasses;
		int attendedclass;
		
		public void getDetails(String name,int Total,int attendence)
		{
			sname = name ;
			Totalclasses = Total;
			attendedclass = attendence;
			
		}
		public void printDetails()
		 {
			 System.out.println("Student name:"+sname);
			 System.out.println("Number of classes held:"+Totalclasses);
			 System.out.println("Number of classes attended:"+attendedclass);
			 
			
		 }

	}



