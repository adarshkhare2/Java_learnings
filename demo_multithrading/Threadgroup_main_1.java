package com.demo_multithrading;

public class Threadgroup_main_1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_main_2 r=new Demo_main_2();
		ThreadGroup GroupA=new ThreadGroup("GroupA");//definding grp
		ThreadGroup GroupB=new ThreadGroup("GroupB");
		
		
		Thread t1=new Thread(GroupA,r,"T1");
		Thread t2=new Thread(GroupA,r,"T2");
		Thread t3=new Thread(GroupA,r,"t3");
		Thread t4=new Thread(GroupA,r,"T3");
		
		Thread t5=new Thread(GroupB,r,"T5");
		Thread t6=new Thread(GroupB,r,"T6");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t5.start();
		//t6.start();

		GroupA.setMaxPriority(Thread.MAX_PRIORITY);//useing as grp
		int activecount=Thread.activeCount();
		System.out.println("active count of thread"+Thread.activeCount());//this method is from grp
		GroupB.list();
	}

}
