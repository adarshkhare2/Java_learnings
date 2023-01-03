package com.task.exception;

import java.util.ArrayList;
import java.util.Scanner;

public class Office extends Object {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee> ();
		Employee E1=new Employee(101,"Adarsh","ADA");
		Employee E2=new Employee(102,"Shubham","SHU");
		Employee E3=new Employee(103,"Bhasker","BHA");
		
		employees.add(E1);
		employees.add(E2);
		employees.add(E3);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther Uid");
		String uid=sc.nextLine();
		System.out.println("Uid is "+uid);
		
		for (Employee employee : employees) {
			if(uid.equalsIgnoreCase(employee.Userid))
			{
				throw new InvalidEmployeeException(" Welcome To office ");
				
			}
			
		}

        if(!employees.contains(uid))
        {
        	throw new InvalidEmployeeException("Invalid EMP ID");
        }
	}

}
