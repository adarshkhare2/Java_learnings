package com.demo_multithrading;

public class Demo_join_met extends Thread {
	public void run() {
		for(int i=0;i<=10;i++)
		{
			try {Thread.sleep(500,300);
				
			} catch (Exception e) {
			System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_join_met t1=new Demo_join_met();
		Demo_join_met t2=new Demo_join_met();
		Demo_join_met t3=new Demo_join_met();
		t1.start();
		try {
			t1.join();// this join method we can use to print t1 separate then then put join for t2 and t3 start process.
		} catch (Exception e) {
		System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
