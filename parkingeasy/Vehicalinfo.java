package com.parkingeasy;

public class Vehicalinfo {
	int vehical_no;
	String owner_name;
	int slot_no ;
	
	public Vehicalinfo(int vehical_no,	String owner_name,int slot_no)
	{
		this.owner_name=owner_name;
		this.vehical_no=vehical_no;
		this.slot_no=slot_no;
	}
	public String toString() {
		return "Employee{"+owner_name+" : "+vehical_no+" : "+slot_no+"}";
	}

}
