package com.collection.comparator;

public class Employeees implements Comparable<Employeees> {
	String name;
	int age,id;
	public Employeees(String name,int age,int id)
	{
		super();
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}

	@Override
	public String toString() 
	{
		return "["+this.name+";"+this.age+":"+this.id+"]";
	}
	@Override
	public int compareTo(Employeees o) {
		
		if(getage()>o.getage())
		{return 1;}
		else if (getage()<o.getage()) {
		{return -1;}
		}else {return 0;}
	}
	@Override
	public boolean equals(Object obj) {
		Employeees e = (Employeees) obj;
		
		return this.id == e.getid();
	}
	
	
	
	
	

}
