package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestJavaCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("A") ;
		arr1.add("B") ;
		arr1.add("C") ;
		arr1.add(0, "D");
		arr1.add(2, "5");
		arr1.set(2,"rrrr");//set use for override
		//arr1.add(5, "100");//We can pass only continue memory locations in array and mainly 70 index is not present 
		Iterator itr = arr1.iterator();
		while(itr.hasNext())//has.Next()=if we find any value 
		{
			System.out.println(itr.next());//next use for pointing next value by pointher 
			//System.out.println();
		}
		System.out.println(arr1);
		for (String x : arr1) {
			System.out.println(x);
		}
		Collections.sort(arr1);//
		
		for(String y: arr1);
		{
			arr1.add("7");
			
			System.out.println(arr1);
		}
		
		System.out.println("size of arraylist"+ arr1.size());
		System.out.println("index is" + arr1.indexOf("7"));
		for(int i=arr1.size()-1;i>=0;i--)
		{
			System.out.println(arr1.get(i));
			if(arr1.get(i).equalsIgnoreCase("C"))
			{
				System.out.println("Got C");
			}
			
		}
	}
	

}
