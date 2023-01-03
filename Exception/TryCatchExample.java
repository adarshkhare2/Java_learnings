package com.Exception;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=50/0;
			
		}
		catch (ArithmeticException A)
		{
		System.out.println(A);
		}

		
		System.out.println("you can't devide by zero");
	}
	

}
