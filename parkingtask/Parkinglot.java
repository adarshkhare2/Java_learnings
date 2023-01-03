package com.parkingtask;

import java.util.ArrayList;
import java.util.List;

public class Parkinglot {
	//storing vehicle
	List<Large> largevehicle=new ArrayList<>(15);
	List<Medium>mediumvehicle=new ArrayList<>(15);
	List<Small>smallvehicle=new ArrayList<>(15);
	
	//number of slot that is present in parkinglot
	private int freelargespot;
	private int freemediumspot;
	private int freesmallspot;
	
	public Parkinglot(int freelargespot,int freemediumspot,int freesmallspot)
	{
		this.freelargespot=freelargespot;
		this.freemediumspot=freemediumspot;
		this.freesmallspot=freesmallspot;
		
	}
	//for parking method
	public void Parkvehicle(Vehicles vehicles) {
		
		System.out.println("We are parking ur vehicle"+vehicles.getVehicletype());
		if (vehicles.getVehicletype().equals(Vehicletype.CAR)) {
			if (freemediumspot>0) {
				parkyourmediumvehicle();
			}else {
				System.out.println("Sorry spot if s=full");
			}
		}else if (vehicles.getVehicletype().equals(Vehicletype.TRUCK)) {
			if (freelargespot>0) {
				parkyourlargevehicle();

			}else {
				System.out.println("Sorry spot if s=full");
			}
			
		}else if (vehicles.getVehicletype().equals(Vehicletype.BIKE)) {
			if (freesmallspot>0) {
				parkyoursmallvehicle();

			}else {
				System.out.println("Sorry spot if s=full");
			}
		}
		
	}
	
	void parkyourlargevehicle(Vehicles vehicles)
	{
		 
	}
 

}
