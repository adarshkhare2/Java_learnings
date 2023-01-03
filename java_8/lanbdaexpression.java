package com.java_8;

public abstract class lanbdaexpression implements Myinterface {

	public static void main(String[] args) {
		Myinterface obj1;
		Lambdainter obj2;
		Lambdastr   obj3;
		
		obj1= () -> 3.478;// this is lambda expression it's like funtion that we can use without body ;
		obj2= () ->System.out.println("Hi i have runned");
		obj3= () -> "adarsh";
		
		
		System.out.println("val is"+ obj1.getpival());
		obj2.prhi();
		System.out.println(obj3.name());
		
		
	}

}
