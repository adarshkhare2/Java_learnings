package com.java_8.Con_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class ParallelArraySorting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=  {6,5,4,3,2,1};
		System.out.println("Before sorting");

		for (int i : arr) {
			System.out.println(i+" ");
		}
		Arrays.parallelSort(arr);
		System.out.println("After sorting");

		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(" char sorted");
		char [] arr1= {'a','c','d','b','k'};
		Arrays.parallelSort(arr1);
		for (char c : arr1) {
			System.out.println(c);
		}
		System.out.println();

	}

}
