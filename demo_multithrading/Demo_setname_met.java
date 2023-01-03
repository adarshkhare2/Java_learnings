package com.demo_multithrading;

public class Demo_setname_met extends Thread {
	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_setname_met t1=new Demo_setname_met();
		Demo_setname_met t2=new Demo_setname_met();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setName("T1thread");//here we are seting a new name for thread 
		
		System.out.println(t1.getName());//

	}

}
