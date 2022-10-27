/*
 * program: student package
 * @author: Aarti
 * @Date: 26 oct 2022
 */

//declaring package
package com.question2.tagline.companiestagline;

import java.util.Scanner;

import com.question2.tagline.Tagline;

//declaring class
public class Itcompany {


	//@SuppressWarnings("static-access")
	// main method
	public static void main(String[] args) {
		
		//creating an object of Tagline class
		Tagline t = new Tagline();
		
		//creating an object of scanner  
		Scanner sc = new Scanner(System.in);
		
		//declaring variable
		String name;
		
		//taking input
		System.out.println("Enter any company name");
		name=sc.nextLine();
	
		//call the printTagline
	t.printTagline(name);
		 
	
		
	}
		
}