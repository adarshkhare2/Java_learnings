package com.Exception;

public class TestExceptionPropagation {
	void m() {int a=50/0;}
	void n() {m();}
	void p() {
		try {
			n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExceptionPropagation obj=new TestExceptionPropagation();
		obj.p();

	}

}
