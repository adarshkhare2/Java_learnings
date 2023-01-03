package com.string_concept;


public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello Java Strings");
		System.out.println(sb);
		sb.append(" here");
		System.out.println(sb);
		sb.insert(3," hi ");
		System.out.println(sb);
		sb.delete(3, 7);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(1,5,"Ni hao ");
		System.out.println(sb.reverse());
		sb.delete(18, 25);
		System.out.println(sb);
		
		
	}

}
