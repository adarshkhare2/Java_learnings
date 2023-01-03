package com.java_number_programs;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of first range");
		int i=sc.nextInt();
		System.out.println("enther the value of second range ");
		int num=sc.nextInt();
		if(i==num)
		{
			System.out.println("same number");
		}else{

			while(i<=num)
			{
				if(i%2==0) {
					System.out.println(i+ " even ");
				}
				i++;

			}
		}

	}
}
