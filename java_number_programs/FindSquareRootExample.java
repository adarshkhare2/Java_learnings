package com.java_number_programs;

import java.util.Scanner;

public class FindSquareRootExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enther the number ");
		int n = sc.nextInt();
		double num = squreroot(n);
		System.out.println("squre root of" + n + "is "+ num);
	}

	public static double squreroot(int num)
	{
		double t;
		double sqrroot = num / 2;

		do {
			t = sqrroot;
			sqrroot = (t + (num / t)) / 2;
		} 
		while ((t - sqrroot) != 0);
		return sqrroot;
	}

}
