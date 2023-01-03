package com.java_number_programs;

public class AutomorphicNumberExample {
	
	static boolean automorphic( int num)
	{
		int squre=num*num;
		while(num>0)
		{
			if(num%10 !=squre%10)
			{
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(automorphic(25)?"automorphic":"not automorphic");
		System.out.println(automorphic(76)?"automorphic":"not automorphic");
	

	}

}
