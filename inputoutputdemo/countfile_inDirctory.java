package com.inputoutputdemo;

import java.io.File;

public class countfile_inDirctory {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\tech\\eclipse-workspace\\Learning\\");
		int count=0;
		String[] s1= f.list();
		System.out.println("File name "+"               File count");

		for (String string : s1) {
			count++;
			System.out.println(s1.toString()+"    "+count);
		}
		

	}

}
