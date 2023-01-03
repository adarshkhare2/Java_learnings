package com.inputoutputdemo;

import java.io.FileWriter;
import java.io.IOException;

public class demo_Filewriter {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		//FileWriter f1=new FileWriter("String File name "); // this we use for create total new file 
		//FileWriter f2=new FileWriter("File");// this  we use to crate new file 
	
		//FileWriter f3=new FileWriter("string File name", false);//this we use to add/append data to file 
		//FileWriter f4=new FileWriter("File name", false);//this we use to add/data to new file 
		
		 FileWriter ff = new FileWriter("C:\\Users\\tech\\eclipse-workspace\\Learning\\Adarsh_Dir\\Adarsh_file.txt") ;
			ff.write("Data sucessfully enther in file ");
			ff.append("\n Next time put full address");
			ff.flush();//this method we use for pushing data instanly in file (No need to wait for buffer)
			ff.append("9999");
			ff.close();
		
	
		//ff.flush();
		//ff.close();
	}

}
