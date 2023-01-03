package com.Exception;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
				int arr[]= {1,2,3,4,5};
				System.out.println(arr[6]);
			} catch ( ArithmeticException a) {
				// TODO: handle exception
				System.out.println(a);
				System.out.println("third block");
			}
				
			} catch (ArrayIndexOutOfBoundsException b) {
				// TODO: handle exception
				System.out.println(b);
				System.out.println("second block");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("first");
		}

	}

}
