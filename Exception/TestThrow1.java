package com.Exception;

public class TestThrow1 {
	public static void age(int age) {
		if(age<18) {
			//System.out.println("is able to vote");
			throw new ArithmeticException("not is able to vote");
		}else {
			System.out.println("able to vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(21);
		System.out.println("rest of code");

	}

}
