package com.array_programs;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the max size of array");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		System.out.println("enter array size");
		
		int n = sc.nextInt();
		while(i<=n)
		{
			System.out.println(i + " put elemnts");

			arr[i] = sc.nextInt();
			i++;

		}
		
		for ( i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
