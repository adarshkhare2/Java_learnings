package com.collection.comparator;

import java.util.TreeSet;

import com.task.exception.Employee;

public class Demo_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeees e1=new Employeees("shushant", 24, 3);
		Employeees e2=new Employeees("anuj", 23, 2);
		Employeees e3=new Employeees("shubham ", 26, 1);
		Employeees e4= new Employeees("adarsh", 22, 4);
		
		TreeSet<Employeees> emp1= new TreeSet<>();
		emp1.add(e1);
		emp1.add(e2);
		emp1.add(e3);
		emp1.add(e4);
		
		for (Employeees x : emp1) {
			System.out.println(x);
		}

		

	}

}
