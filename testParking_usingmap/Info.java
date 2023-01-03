package com.testParking_usingmap;

public class Info {
	int vehical_no;
	String owner_name;
	
	public Info(int vehical_no,	String owner_name)
	{
		this.owner_name=owner_name;
		this.vehical_no=vehical_no;
	}
	public String toString() {
		return "Employee{"+owner_name+" : "+vehical_no+"}";
	}

}
