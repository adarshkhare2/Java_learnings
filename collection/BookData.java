package com.collection;

import java.util.LinkedList;

public class BookData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> Lib=new LinkedList<Book>();
		
		 	Book b1=new Book(101,8,"Let us C","Yashwant Kanetkar","BPB");  
		    Book b2=new Book(102,4,"Data Communications & Networking","Forouzan","Mc Graw Hill");  
		    Book b3=new Book(103,6,"Operating System","Galvin","Wiley"); 
		    
		    
		    Lib.add(b1);
		    Lib.add(b2);
		    Lib.add(b3);
		    
		    for (Book bookS : Lib) {
				System.out.println(bookS);
			}
		    
		    System.out.println(Lib.clone()+" ");

	}

}
