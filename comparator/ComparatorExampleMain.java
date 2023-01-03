package com.collection.comparator;

import java.util.ArrayList;
import java.util.List;

public class ComparatorExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeees e1=new Employeees("shushant", 24, 3);
		Employeees e2=new Employeees("anuj", 23, 2);
		Employeees e3=new Employeees("shubham ", 26, 1);
		Employeees e4= new Employeees("adarsh", 22, 4);
		Employeees e5= new Employeees("shubham", 29, 4);
		
		
		ArrayList<Employeees> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e4);
		emp.add(e3);
		emp.add(e2);
		
		for (Employeees x : emp) {
			System.out.println(x);
		}
		emp.sort(new Agecomparator());
		System.out.println(emp);
		emp.sort(new Namecomparator());
		System.out.println(emp);
		emp.sort(new idcomparator());
		System.out.println(emp);
		
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e4.equals(e5));
		System.out.println(e3.equals(e2));
		
		//System.out.println(String.format("there are %d + %d", 10,15));
		System.out.printf("%d"+" %d","hellow",10);
		
		
		
	}
	

}
