package com.java_8.Con_1;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamelist=new ArrayList<String>();
		gamelist.add("chess");
		gamelist.add("kho kho");
		gamelist.add("khabadi");
		gamelist.add("polo");
		gamelist.add("carrom");
		
		gamelist.stream().forEach(games->System.out.println(games));//this is for each method using with stream
		System.out.println(" ");
		gamelist.stream().forEach(notgame->System.out.println(notgame));//this is for each method using with stream
		System.out.println(" ");
	}

}
