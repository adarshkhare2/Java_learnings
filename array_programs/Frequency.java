package com.array_programs;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		a = sc.nextInt();
		int arr[] = new int[a];// size

		System.out.println("enther the elements");
		//b = sc.nextInt();

		for (int k = 0; k < a; k++) {
			arr[k] = sc.nextInt();// store elements

		}

		int fr[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;

				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("===========");
		System.out.println("number | frequency");
		System.out.println("===========");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println(arr[i] + " | " + fr[i]);
			}
		}
      //System.out.println(arr.length);
	}

}
