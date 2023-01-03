package com.task.exception;

public class InvalidEmployeeException extends Exception{
	
public InvalidEmployeeException(String Wronguser)
		 {
			 super (Wronguser);
		}
}