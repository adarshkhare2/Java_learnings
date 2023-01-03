package com.inputoutputdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class demo_bufferedwriter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fr =new FileWriter("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\Adarsh_file.txt");
		BufferedWriter Bw = new BufferedWriter(fr);
		Bw.append("Jdjabjdbui");
		// this has over ride data 
		Bw.write("\n Using Bufferwriter  ");
		Bw.newLine();//USE TO change line to make line by line 
		Bw.write(" Using Bufferwriter in new line  ");
		Bw.close();
		FileReader fr1 =new FileReader("C:\\\\Users\\\\tech\\\\eclipse-workspace\\\\Learning\\\\Adarsh_Dir\\\\Adarsh_file.txt");
		BufferedReader Br= new BufferedReader(fr1);
		int i = Br.read();
		while(i!=-1)//Until count 0 it will run
		{
			System.out.print((char)i);
			i=Br.read();
		}
		Br.close();
	}

}
