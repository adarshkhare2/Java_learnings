package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setuse_1 {

	public static void main(String[] args) {
		//1. Set does not maintain the insertion orders
		//2.set do support sorting 
		System.out.println("Hashset:- unique element,unsorted,unordered");
		HashSet<Integer> S1=new HashSet<>();//new Hashmap is constructor
		S1.add(5);
		S1.add(99);
		S1.add(4);
		S1.add(3);
		S1.add(2);
		S1.add(1);
		S1.add(19);
		
		
		
		
		for (Integer X : S1) {
			System.out.println(X);
		}
		
	System.out.println( " ");

		
//	System.out.println(S1.contains(3));
	
	//Linkedhashset
	System.out.println("Linkedhashset:- Unique element,maintain insertion order");
		LinkedHashSet<Integer>S2=new LinkedHashSet<>();
		S2.add(5);
		S2.add(99);
		S2.add(4);
		S2.add(3);
		S2.add(2);
		S2.add(1);
		S2.add(19);
		for (Integer Y : S2) {
			System.out.println(Y);
		}
	//System.out.println(S1.hashCode());
	//System.out.println(S1.size());
		
		System.out.println();
		
		//Treeset
		System.out.println("Treeset:- Unique elemsnt,sorted based on natural order");
		TreeSet<Integer> S3=new TreeSet<>();
		S3.add(5);
		S3.add(99);
		S3.add(4);
		S3.add(3);
		S3.add(2);
		S3.add(1);
		S3.add(19);
		for (Integer Z : S3) {
			System.out.println(Z);
		}
		
		System.out.println();
		
		
		
		System.out.println(S3.tailSet(2, true)+"only for treeset");//use this to get bigger values then 2 in sorted manner 
		
		

	}

}
