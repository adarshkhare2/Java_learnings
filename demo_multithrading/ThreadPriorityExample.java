package com.demo_multithrading;

public class ThreadPriorityExample extends Thread {
	
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityExample t1=new ThreadPriorityExample();
		ThreadPriorityExample t2=new ThreadPriorityExample();
		ThreadPriorityExample t3=new ThreadPriorityExample();
		ThreadPriorityExample t4=new ThreadPriorityExample();
		
		t1.setPriority(4);
		t2.setPriority(2);
		t3.setPriority(1);
		t4.setPriority(3);
		
		t1.setName("ye 4 th h");
		t2.setName("ye 2ed h");
		t3.setName("ye 1st h");
		t4.setName("ye 3ed h");
		
		//t4.run();
		t1.setDaemon(true);
		t2.setDaemon(false);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		
	
	}
	}
