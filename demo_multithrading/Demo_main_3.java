package com.demo_multithrading;

public class Demo_main_3 extends Thread{
	//int a=10;
	public void run() {
		System.out.println("void");
	}
	public void run(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_main_3 T=new Demo_main_3();
		T.run();
		T.run(8);
	}

}
