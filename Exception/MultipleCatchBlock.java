package com.Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[]= {1,2,3,4,5};
		arr[2]=20/0;//first we have to calculate a value then we have to assignee that by fArithmeticmatic then array outs of bond
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("runnn");
	}

}
