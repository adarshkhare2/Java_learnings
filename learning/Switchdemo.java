package com.learning;

import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		System.out.println("please enter the number b/t 1 to 3....");
		//int month=4;
		Scanner sc = new Scanner(System.in);
		
		int monthstring= sc.nextInt();
		System.out.println("thanks for selecting :"+monthstring);
		
		switch(monthstring)
		{
			case 1:
				System.out.println("this is first month");
			break;
			
			case 2:
				System.out.println("this is 2nd month");
			break;
			
			case 3:
			System.out.println("this is 3rd month");
			break;
			
			default:
				
			System.out.println("idito please enter the number");
			break;
		}
		System.out.println("thanks");

	}

}
