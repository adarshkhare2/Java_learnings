package com.collection.comparator;

import java.util.Comparator;

public class Namecomparator implements Comparator<Employeees>{

	@Override
	public int compare(Employeees e1, Employeees e2) {
		// TODO Auto-generated method stub
		return e1.getname().compareTo(e2.getname());
	}
	

}
