package com.javabasicprogram;

import java.util.Random;

public class RandomNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		System.out.println(random.nextGaussian());
	}

}
