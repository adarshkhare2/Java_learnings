package com.inputoutputdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class Meargedata_alternative {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\file_3_to_read.txt");
		BufferedReader br1= new BufferedReader(new FileReader("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\file_1_to_write.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\file_2_to_read.txt"));
		String line1= br1.readLine();
		String line2= br2.readLine();
		while(line1!=null|| line2!=null)
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		System.out.println("File Has been copy altarnative in write file");
		
		

	}

}
