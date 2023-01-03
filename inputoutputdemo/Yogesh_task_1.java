package com.inputoutputdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Yogesh_task_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr =new FileReader("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\Learning\\\\Adarsh_Dir\\\\File_to_read.txt");
		BufferedReader bw= new BufferedReader(fr);
		int i=fr.read();
		while(i!= -1)
		{
			System.out.print((char)i);
			i= fr.read();
			System.out.println("Read");
		}
		PrintWriter fw= new PrintWriter("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\Learning\\\\Adarsh_Dir\\\\File_to_Writein.txt");
		fw.write(i);
		System.out.println("Write");
		fw.close();
	
		fr.close();
		bw.close();
		

	}

}
