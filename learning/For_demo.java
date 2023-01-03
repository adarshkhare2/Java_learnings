package com.learning;

import java.util.Iterator;

public class For_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=9;
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
