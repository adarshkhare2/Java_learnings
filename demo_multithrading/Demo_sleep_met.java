package com.demo_multithrading;

public class Demo_sleep_met extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
		{
			try {Thread.sleep(500);//sleep method use for making a deley in process
			//try {Thread.sleep(-500);//sleep method use for making a deley in process and it will show some time value is negative

				
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_sleep_met t1=new Demo_sleep_met();
		Demo_sleep_met t2=new Demo_sleep_met();
		
		t1.run();
		t2.run();

	}

}
