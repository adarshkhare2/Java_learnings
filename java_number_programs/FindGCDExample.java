package com.java_number_programs;

import java.util.Scanner;

public class FindGCDExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int GCD = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enther x");
		int x= sc.nextInt();
		System.out.println("please enther y");
		int y=sc.nextInt();
		
		for(int i = 1; i<=x&&i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				 GCD=i;
			}
		}System.out.println("for"+x+"and"+y+"GCD is"+ GCD);
	}

}
