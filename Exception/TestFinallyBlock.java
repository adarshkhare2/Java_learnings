package com.Exception;

public class TestFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		try {
			int data=25/0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			System.out.println("finally block run..");

		}
		System.out.println("out of blocks");

	}

}
