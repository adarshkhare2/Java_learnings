package com.inputoutputdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Adddata_2fileto_1file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("file_1_to_write.txt");//this we use to write data 
		
		BufferedReader br1= new BufferedReader(new FileReader("file_2_to_read.txt"));// this we to read
		String line1 =br1.readLine();
		while(line1!=null)
		{
			pw.println(line1);
			br1.read();
		}
		BufferedReader br2 = new BufferedReader(new FileReader("file_3_to_read.txt"));
		String line2 = br2.readLine();
		while (line2!=null)
		{
			pw.println(line2);
			br2.read();
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		
		

	}

}
