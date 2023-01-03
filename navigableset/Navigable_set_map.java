package com.navigableset;

import java.util.TreeSet;

public class Navigable_set_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

			TreeSet<Integer>hh=new TreeSet<>();
			hh.add(1000);
			hh.add(2000);
			hh.add(3000);
			hh.add(4000);
			hh.add(5000);
			System.out.println(hh.floor(3000));
			System.out.println(hh.ceiling(4000));
			System.out.println(hh.higher(3000));
			System.out.println(hh.lower(5000));
			System.out.println(hh.pollFirst());
			System.out.println(hh.pollLast());
			System.out.println(hh.descendingSet());
			

		

	}

}
