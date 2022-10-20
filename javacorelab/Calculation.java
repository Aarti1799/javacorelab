/*
program: WAP to find the 1. square, 2. cube, 3. check number is odd or even.
@date:20 oct 2022
*/

import java.util.Scanner;
//declaring class
class Calculation
{
	static void square(int number)
	{
		int square=number*number;
		System.out.println("The square:"+square);
	}
	static void cube(int number)
	{
		int cube=number*number*number;
		System.out.println("The cube:"+cube);
	}
	static void checkEvenOdd(int number)
	{
		if((number%2)==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");
	}
	
	// main method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		int choice;
		
		//taking input
		System.out.print("Enter any numbers");
		number=sc.nextInt();
		
		
		System.out.println("1.square");
		System.out.println("2.cube");
		System.out.println("3.check number is even or odd");
		
		System.out.println("4.Exit");
		choice=sc.nextInt();
		
		switch(choice)//starting switch case
		{
			case 1:square(number);
			      break;
		    case 2:cube(number);
			      break;
			case 3:checkEvenOdd(number);
			      break;
			
			      
			default: System.out.println("Wrong input");	  
		}//end of switch
		
		
	}//end of main
}//end of class