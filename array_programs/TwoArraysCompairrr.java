package com.array_programs;

public class TwoArraysCompairrr {

	public void Met(int x) throws Tryagain {
		int count =0;
		int A[] = { 101, 102, 103, 104, 105 };
	
		for (int i = 0; i <=A.length-1; i++) {
			if(A[i]==x) {
				System.out.println("this value is present and the value is at position in index --> "+i);
				count++;
			}

			
		}
		if(count >= 1) {
			System.out.println("value is present");
		}
		else {
			throw new Tryagain("there is no number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoArraysCompairrr obj = new TwoArraysCompairrr();
		try {
			obj.Met(111);

		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Rest of the code");

	}

}
