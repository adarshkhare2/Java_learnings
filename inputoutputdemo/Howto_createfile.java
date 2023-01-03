package com.inputoutputdemo;
import java.io.File;
import java.io.IOException;

public class Howto_createfile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("Adarsh_Dir");
		f.exists();//use to check if exist or not 
		f.mkdir();//use to create directory
		f.createNewFile();//use to create new file 
		f.exists();// to check if file got created /exists or not
		//f.delete();//It use to delete the current dir or file 
		
		File f1=new File("Adarsh_Dir", "Adarsh_file.txt");
		f1.exists();
		f1.createNewFile();
		f1.exists();
		//f1.delete();


		
		System.out.println("END");
	
	}

}
