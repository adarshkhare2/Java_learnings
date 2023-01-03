package com.demo_multithrading;

public class Demo_runnable_interface_main extends Demo_runnable_interface  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_runnable_interface r=new Demo_runnable_interface();
		Thread t1 =new Thread(r);   // Using the constructor Thread(Runnable r)  
		t1.start();//that we can only use in this me
		
		

	}

}
