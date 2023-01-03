package com.array_programs;

import java.util.Iterator;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the max size of array");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		System.out.println("enter array size");
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(i + " put elemnts");

			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		
		int a='A';
		int b='K';
		int d='K'-'A';
		int c='A'/'A';
		for(int i=c;i<=d;i++)
		{
			System.out.println(i);
		}
	}

}
