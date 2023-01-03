package com.java_8.Con_1;

import java.util.Arrays;

public class MethodReference  {
 public static void saysmthing() {
	System.out.println("Hi running");
}

	public static void main(String[] args) {
		sayable ref = MethodReference::saysmthing;
		sayable ref1= MethodReference::saysmthing;

		ref.say();// this is ex. for Reference to a Static Method
		System.out.println(" ");
		for(int i=1;i<10;i++) {
		ref1.say();//this is ex. for Reference to an Instance Method 
		}
		ref.say();
		System.out.println(" ");
		ref1.say();
	
		int [] a = new int[5];
		a[0]=1;
		a[3]=5;
		System.out.println(Arrays.toString(a));
		
		String [] b=new String [5];
		b[0]="AA";
		b[2]="BB";
		b[4]="CC";
		System.out.println(Arrays.toString(b));
		
		boolean [] c=new boolean [5];
		c[0]= true;
		c[3]= true;
		System.out.println(Arrays.toString(c));
	}

}
