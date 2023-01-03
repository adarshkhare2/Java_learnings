package com.collection;

import java.util.EnumSet;
import java.util.Set;

enum Diractions//in side java we can define methods and variables,construes  inside the enums but in c/c++ we can't do this 
{
	EAST ,WEST,NORTH,SOUTH;
	//variables
	int price;
	//construes
	Diractions() {
	price=50;
	}
	//method
	public int getprice()
	{
		return price;
	}
	}

public class Enum_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Diractions.SOUTH);
		
		Set<Diractions> dd = EnumSet.of(Diractions.NORTH);// here we are intitaling the set obj.
		for (Diractions x : dd) {
			System.out.println(x);
			
		}

	}

}
