
package com.javabasicprogram;

public class PrimeExample {

	public static void main(String[] args) {
		int i, n = 15,flag = 0;
		if (n == 0 || n == 1) {
			System.out.print(n + "not a prime number");

		} else {
			flag=0;
			for (i = 2; i <=n; i++) {
			 
				if (n % i == 0) {
					flag++;
					
				}

			}
System.out.println(flag);
			if (flag == 1) {
				System.out.println(n + "this is prime number");
			} else {
				System.out.println("it is not  a prime number " + n);
			}

		}

	}

}
