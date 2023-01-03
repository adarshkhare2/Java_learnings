package com.Exception;

public class TryCatchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int arr[]= {1,2,3,4};
			System.out.println(arr[10]);//array 10 th index is empty 
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

	}

}
