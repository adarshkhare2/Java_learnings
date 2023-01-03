package com.Exception;

import java.io.IOException;

public class Testthrows {
	// TODO Auto-generated method stub
	void m() throws IOException// we use throws for method
	{
		throw new IOException("exception");//we are using throw for statement 
	}
	void n() throws IOException
	{
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		Testthrows obj=new Testthrows();
		obj.p();
	}

}
