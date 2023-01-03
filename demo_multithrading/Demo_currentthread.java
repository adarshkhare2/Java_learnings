package com.demo_multithrading;

public class Demo_currentthread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_currentthread t1=new Demo_currentthread();
		Demo_currentthread t2=new Demo_currentthread();
		
		
		t1.start();
		t2.start();
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setName("ADARSH");
		t2.setName("adarsh");
		System.out.println(t1.getName());
		System.out.println(t2.getName());

	}

}
