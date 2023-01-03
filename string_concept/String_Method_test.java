package com.string_concept;

public class String_Method_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc = "woooo hoooo java";
		String sc1= "	Adarsh is learning ";
		String sc2 = "woooo hoooo java";
		String sc3 = "";


		
		//char ch = sc.charAt(2);
		//System.out.println(ch);
		for(int i=0;i<sc.length()-1;i++)
		{
			if(i%2==0) {
			System.out.println("in string "+ i +" place is :- "+sc.charAt(i));
			
			}
			
			
			else if(i==8) {
				//System.out.println(" ");
				System.out.println("not 8");
			}
		}
		System.out.println(sc.concat("java"));
		System.out.println(sc.contains("ho"));
		System.out.println(sc.endsWith("va"));
		System.out.println(sc.equals(sc2));
		System.out.println(sc.equalsIgnoreCase(sc2));
		System.out.println(sc3.isEmpty());
		System.out.println(sc1.replace('A', 'a'));//to replace one char
		System.out.println(sc.replaceAll(sc2, sc));//to replace all sting with another one 
		System.out.println(sc.substring(2,8));//to create sub string
		System.out.println(sc1.toLowerCase());
		System.out.println(sc1.toUpperCase());
		System.out.println(sc1.trim());//to use remove/trim space
		
		
		
		

	}

}
