package com.collection.comparator;

import java.util.Comparator;

public class Agecomparator implements Comparator<Employeees> {

	@Override
	public int compare(Employeees e1, Employeees e2) {
		if(e1.getage()>e2.getage())
		{return 1;}
		else if (e1.getage()<e2.getage()) {
		{return -1;}
		}else {return 0;}
		
	}
	
	

}
