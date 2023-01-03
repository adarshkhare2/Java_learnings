package com.java_number_programs;

import java.util.Scanner;

public class CheckPerfectSquareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enther number you want to check squre");
		float number=sc.nextFloat();
		double x= Math.sqrt(number);
		
		if (x ==(int)x)
		{
			System.out.println(number+"is a perfact squre");
		}else
		{
			System.out.println(number+" is not perfact squre");
		}

	}

}
