package com.java_number_programs;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		int n = sc.nextInt();
		for (int n = 1; n <= 100; n++) {
			if (n % 3 == 0 && n % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (n % 3 == 0) {
				System.out.println("fizz");
			}

			else if(n%5==0) {
				System.out.println("buzz");

			}
			else {
				System.out.println(n);
			}
		}

	}

}
