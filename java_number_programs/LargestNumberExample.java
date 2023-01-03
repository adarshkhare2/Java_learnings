package com.java_number_programs;

import java.util.Scanner;

public class LargestNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,temp,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num");
		a=sc.nextInt();
		System.out.println("enter second num");
		b=sc.nextInt();
		System.out.println("enter third num");
		c=sc.nextInt();
		
		temp=a>b?a:b;
		large=temp>c?temp:c;//use this mostly for code optimazation (temp = condition?true:failse)
				
		System.out.println("from these 3 number"+" "+ large + " this largest ");
	}

}
