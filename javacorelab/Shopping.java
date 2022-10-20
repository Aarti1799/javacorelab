/*
program: WAP to give 10% discount to the user whose shopping bill id greater than 2000.
@date:20 oct 2022
*/

import java.util.Scanner;
//declaring class
class Shopping
{
	
	// main method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int qty, total, discount, totalamount;
		
		//taking input
		System.out.println("the price of any one product is: 540");
		
		
		System.out.println("Enter name of product");
		char name=sc.next().charAt(0);
		
		System.out.println("enter the quantity");
		qty=sc.nextInt();
		
		total=(qty*540);
		
		
		if(total>=2000)
		{
			discount=(total/10);
			totalamount=total-discount;
			System.out.println("you get 10% discount and you have to pay: "+totalamount);
			
		}
		else
			System.out.println("sorry!! you cannot get any discount so your Total price: "+total);
			
		
		
	}//end of main
}//end of class