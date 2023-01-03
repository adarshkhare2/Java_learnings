package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>phonebook=new HashMap<Integer,String>();
		
	phonebook.put(1,"Adarsh");
	phonebook.put(2,"Shubam");
	phonebook.put(3,"Bhasker");
	
	
	System.out.println(phonebook.remove(2));//we use this for removing element 
	System.out.println(phonebook.replace(3, "you"));//we use this for replace value
	System.out.println(phonebook.containsKey(3));//to check if its have that key value
	System.out.println(phonebook.put(4,"charan"));
	System.out.println(phonebook.put(5,"sherenu"));
	
	
	if (phonebook.containsValue("Adarsh")) {
		System.out.println("present ");
	}
	System.out.println(phonebook.containsKey(4));
	System.out.println(phonebook.remove(4));
	System.out.println(phonebook.replace(5,"LOL"));
	
	for (Map.Entry number :phonebook.entrySet()) 
	{
		//System.out.println(number);
		System.out.println(number.getKey()+" "+number.getValue());//to get key and value 
	}
	}

}
