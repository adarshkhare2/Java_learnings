package com.demo_multithrading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpoolmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Threadpool_1 t1=new Threadpool_1(null)
		//	we use this
		
		ExecutorService t1= Executors.newFixedThreadPool(5);
		for(int i=0;i<=10;i++) {
		Runnable tt=new Threadpool_1(" "+ i + ":");
		t1.execute(tt);
		// LocalDateTime now = LocalDateTime.now();
	     //System.out.print(String.format("%s : %s", now.getMinute(),now.getSecond()));
		}
	}

}
