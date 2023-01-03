package com.inputoutputdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo_printwriter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw =new PrintWriter("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\printewriter.txt");
		pw.write(100);// differance b/w it will print d(ASCII) value
		pw.println(100);

		pw.print(100);
		pw.println("Adarsh");
		pw.flush();
		pw.close();
	}

}
