/*
Program: WAP to find the oldest and youngest
@Date: 19/oct/2022
*/

//import packages

import java.util.Scanner;

//declaring class
class CheckOldestYoungest
{
	//main method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2,age3;

		//taking input
		System.out.println("Enter the age of 1st people:");
		age1=sc.nextInt();
		System.out.println("Enter the age of 2nd people:");
		age2=sc.nextInt();
		System.out.println("Enter the age of 3rd people:");
		age3=sc.nextInt();
		//checking the oldest and Youngest people
		if((age1>age2)&&(age1>age3))
		{
			System.out.println("the age of  oldest peole is:"+age1);
		}
		else 
		{
			System.out.println("the age of Youngest people is:"+age1);
		}
		if((age2>age1)&&(age2>age3))
		{
			System.out.println("the age of  oldest peole is:"+age2);
		}
		else
		{			
			System.out.println("the age of Youngest people is:"+age2); 
		}
		if((age3>age1)&&(age3>age2))
		{
			System.out.println("the age of  oldest peole is:"+age3);
		}
		else 
		{
			System.out.println("the age of Youngest people is:"+age3);
		}
		//end of if else
	}//end of main method

}//end of class