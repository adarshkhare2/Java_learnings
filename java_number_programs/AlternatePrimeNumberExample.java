package com.java_number_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatePrimeNumberExample {

	public static void main(String[] args) {

		int n, status = 1, num = 3, i, j, k;

		// we are using here arraylist
		ArrayList<Integer> primelist = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the value of n");
		n = sc.nextInt();

		if (n >= 1) {
			System.out.println(" First " + n + " prime number are");
			System.out.println(2);
			primelist.add(2);
		}

		for (i = 2; i <= n;) {
			for (j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}

			}
			if (status != 0) {
				System.out.println(num);
				primelist.add(num);
				i++;
			}

			status = 1;
			num++;
		}
		System.out.println("printing a altarnative numbers");
		for (k = 0; k < primelist.size(); k++) {
			if ((k % 2) == 0) {
				System.out.println(primelist.get(k));
			}
		}

	}

}
