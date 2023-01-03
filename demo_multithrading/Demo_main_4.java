package com.demo_multithrading;

public class Demo_main_4 {
	public void run() {
		System.out.println("run");
	}
	public void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_main_4 tt=new Demo_main_4();
		tt.run();
		tt.start();
		
	}

}
