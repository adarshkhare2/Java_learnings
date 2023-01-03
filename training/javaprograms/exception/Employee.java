package com.task.exception;

import java.util.ArrayList;

public class Employee {
	int ID;
	String Name;
	String Userid;
	public Employee(int ID,String Name,String Userid) 
	{
		
		this.ID=ID;
		this.Name=Name;
		// here we define setter and then we pass value in the main getter, in the set we compare with if and give exception 
		this.Userid=Userid;
	}
	@Override
	public String toString() {
		return "Employee{"+ID+" : "+Name+" : "+Userid+"}";
	}
	
	
}


