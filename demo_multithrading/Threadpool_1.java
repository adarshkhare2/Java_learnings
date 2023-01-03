package com.demo_multithrading;
//want to use Date and time funtion


public class Threadpool_1 implements Runnable {

	private String name;
	public Threadpool_1(String name)
	{
		this.name=name;
	}
	//@override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start Thread ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" End Thread ");
	}
	
	
}
