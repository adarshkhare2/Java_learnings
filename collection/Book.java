package com.collection;

public class Book {
	int ID, Quantity;
	String Name,Author,Publisher; 
	public Book(int ID,int Quantity,String Name,String Author,String Publisher)
	{
		this.ID=ID;
		this.Quantity=Quantity;
		this.Name=Name;
		this.Author=Author;
		this.Publisher=Publisher;
		
		
	}
	@Override
	public String toString()
	{
		return "Book{"+ID+":"+Quantity+":"+Name+":"+Author+":"+Publisher+"}";
	}
	
}
