package com.parkingeasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easyparking {

	public static void main(String[] args) {
		
		// String car,bike ;
		 int car=1,bike=2,choise;
		List<Vehicalinfo> Bike=new ArrayList<>();
		List<Vehicalinfo> Car=new ArrayList<>();
		
		
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
		 
		 Vehicalinfo cus1=new Vehicalinfo(vehical_no,owner_name,slot_no);

	 Car.add(cus1);
	 for (Vehicalinfo vehicalinfo : Car) {
		System.out.println("Name of car owner:-"+ vehicalinfo.owner_name + " Vehical Number :-"+vehicalinfo.vehical_no+" Vehical Parking slote "+ vehicalinfo.slot_no +" Slots Full in parking "+ Car.size() );
	}
	// System.out.println("Total cars in parking is "+ Car.size());
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
		 
		 Vehicalinfo cus2=new Vehicalinfo(vehical_no,owner_name,slot_no);

	 Bike.add(cus2);
	 for (Vehicalinfo vehicalinfo : Bike) {
			System.out.println("Name of car owner:-"+ vehicalinfo.owner_name + " Vehical Number :-"+vehicalinfo.vehical_no+" Vehical Parking slote "+ vehicalinfo.slot_no +" Slots Full in parking "+ Bike.size() );
	 }
	// System.out.println("Total bikes in parking is "+ Bike.size());
	 }else {
		 System.out.println("Bike Parking is full:-");
		 break;
	 }
 }

}

		
	}

}
