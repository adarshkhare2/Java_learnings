package com.testParking_usingmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Easyparking_map {

	public static void main(String[] args) {
		
		// String car,bike ;
		 int car=1,bike=2,choise ;
		 Map<Integer,Info> Bike=new LinkedHashMap();
		 Map<Integer,Info> Car= new LinkedHashMap();
		 
		
		
for(int i=0;i<=30;i++)
{		
System.out.println("Enter the Vehical type 1 for car 2 for bike");	
System.out.println(car +" or "+ bike);	
 Scanner sc=new Scanner(System.in);
 choise=sc.nextInt();
 


 if(choise==car)
 {
	 if(Car.size()<15)
	 {
		 System.out.println("Enter vehical No.:-");
		 Scanner X=new Scanner(System.in);
		 int vehical_no=X.nextInt();
		 System.out.println("Enter Car owner name:-");
		 Scanner Y=new Scanner(System.in);
		 String owner_name=Y.nextLine();
		 System.out.println("Enter vehical slot no:-");
		 Scanner Z=new Scanner(System.in);
		 int slot_no=Z.nextInt();
		 
		 Info cus1=new Info(vehical_no,owner_name);
		 int slot = 1;

	 Car.put(slot, cus1);
	 System.out.println(Car);
	
	 }else {
		 System.out.println("Car Parking is full:-");
		 break;
	 }

 }
 
 if(choise==bike)

 {
	 
	 if(Bike.size()<15) {
		 
		 System.out.println("Enter vehical No.:-");
		 Scanner X=new Scanner(System.in);
		 int vehical_no=X.nextInt();
		 System.out.println("Enter Car owner name:-");
		 Scanner Y=new Scanner(System.in);
		 String owner_name=Y.nextLine();
		 System.out.println("Enter vehical slot no:-");
		 Scanner Z=new Scanner(System.in);
		 int slot_no=Z.nextInt();
		 
		 Info cus2=new Info(vehical_no,owner_name);
		 int slot=16;

	 Bike.put(slot, cus2);
	 System.out.println(Bike);

 }
	 }else {
		 System.out.println("Bike Parking is full:-");
		 break;
	 }
 }

}

		
	}


