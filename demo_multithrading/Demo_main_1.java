package com.demo_multithrading;

import java.util.Iterator;

public class Demo_main_1 extends Thread{
	

	public static void main(String[] args) {
		Demo_main_1 T=new Demo_main_1();
		Demo_main_2 T1=new Demo_main_2();
		Demo_main_3 T3=new Demo_main_3();
		for(int i=0;i<10;i++) {System.out.println("perent thread");}
		T.run();
		//T1.start();


	}

}
