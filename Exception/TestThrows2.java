package com.Exception;

public class TestThrows2 {
	public static int dividenum(int m,int n) throws ArithmeticException
	{
		int div=m/n;
		return div; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows2 obj=new TestThrows2();
		try {
			obj.dividenum(45, 0);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
