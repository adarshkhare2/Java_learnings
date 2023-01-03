package com.demo_multithrading;

public class shutdownhookmain extends Thread {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Thread t1=new Thread();
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t1);
		for(int i=1;i<=10;++i)
		{
			System.out.println("Main thread");
			try {
				t1.sleep(1500);

			} catch (Exception e) {
			}
		}
	}

}
