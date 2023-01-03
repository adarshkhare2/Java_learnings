package com.navigableset;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sortdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aa=new ArrayList<>();
		aa.add("A");
		aa.add("J");
		aa.add("M");
		aa.add("a");
		aa.add("y");
		aa.add("r");
		aa.add("b");
		aa.add("z");
		//aa.add(new Integer(20));//class cast exception
		
		//aa.add(null);//nullpointer exception
		
		System.out.println(aa);
		System.out.println(Collections.binarySearch(aa, "r"));

		Collections.sort(aa);
		System.out.println(aa);
		System.out.println(Collections.binarySearch(aa, "r"));
		System.out.println(Collections.binarySearch(aa, "M"));
		Collections.reverse(aa);
		System.out.println(aa);
	}

}
