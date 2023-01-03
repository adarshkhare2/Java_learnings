package com.array_programs;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[]= new int [] {1,2,3,4,5,6};
		 int arr2[]= new int[arr1.length];
		 for (int i=0;i<arr1.length;i++)
		 {
			 arr2[i]=arr1[i];
		 }
		 System.out.println("orignal array");
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(i+" ");
		 }
		 System.out.println("duplicate array");
		 for(int i=0;i<arr2.length;i++)
		 {
			 System.out.println(i+" ");
		 }
		 

	}

}
