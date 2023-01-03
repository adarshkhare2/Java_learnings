package com.Exception;

public class TestCustomExcep {

	static void Enter(int age) throws InvalidAgeException
	{
		if (age>18)
		{
			System.out.println("able to vote");
		}
		else {
			throw new InvalidAgeException("not able to vote");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {

		
		 try { Enter(2); } catch (InvalidAgeException e) { // TODO: handle exception
		 System.out.println(e); }
		 
		
	}

}
