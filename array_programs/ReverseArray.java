package com.array_programs;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 12, 3, 33, 5, 6, 8, 9 };
		System.out.println("orignal array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		System.out.println("reverse array ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("even postion number are");

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("odd postion numbers are");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("even nums are");

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" ");
		System.out.println("odd nums are");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}
		Arrays.sort(arr);
		System.out.println(" ");

		System.out.println("Arrays in sorted form");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
