package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class FIFO_Queue {
	


	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<>();
		que.add(5);//.add() use to add ele
		que.add(4);
		que.add(3);
		que.add(2);
		que.add(1);
		que.offer(6);//.offer() also use for add ele
		que.poll();//use to remove top/head ele if queue empty its show null
		que.remove();//use to remove head of ele
		que.element();// use to show the head ele
		que.peek();//use to show head ele if queue empty its show null
		

		for (Integer x : que) {
			System.out.println(x);
		}
		
		System.out.println("This is for loop queue");
		
		
	Queue<Integer> que1=new PriorityQueue<>();
	for(int i=0;i<=10;i++)
	{
		que1.add(i);
	}
	System.out.println(que1);
	System.out.println(que1.poll());
	System.out.println(que1.peek());
	System.out.println(que1.remove(9));
	System.out.println(que1.element());
	}

}
