package com.java_number_programs;

import java.util.Scanner;

public class ATMExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=10000,withdraw,deposit;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcoem to SBI ATM");
			System.out.println("chose 1 for withdrow");
			System.out.println("chose 2 for deposite");
			System.out.println("chose 3 for check blance");
			System.out.println("chose 4 for exit");
			int choise=sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("enter the amount to withdraw");
				 withdraw = sc.nextInt();
				if (balance>=withdraw)
				{
					balance=balance-withdraw;
					System.out.println("withdeawing ");
				}else
				{
					System.out.println("not valid amount");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("please enther the deposite amount");
				deposit=sc.nextInt();
				
				balance=balance+deposit;
				System.out.println(" your money got deposit");
				System.out.println("new balance is "+balance);
				System.out.println("");
				break;
			case 3:
				System.out.println();
				System.out.println("your account balance is "+ balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
				break;
			}
			
		}

	}

}
