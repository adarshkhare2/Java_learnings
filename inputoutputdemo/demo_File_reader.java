package com.inputoutputdemo;

import java.io.FileReader;
import java.io.IOException;

public class demo_File_reader {

	public static void main(String[] args) throws IOException {
		// in this we have used type casting and we are printing values by storing char value and printing them with loop
		FileReader ff= new FileReader("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\Learning\\\\Adarsh_Dir\\\\Adarsh_file.txt");
		int i=ff.read();
		while(i!=0)
		{
			System.out.print((char)i);
			i=ff.read();
		}
		ff.close();
		
		

	}

}
