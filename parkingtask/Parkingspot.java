package com.parkingtask;

public class Parkingspot {
	private Spottype type;//this variable will take parking spot 
	private Vehicles vehicles;//this will take vehicle type
	private boolean empty;//this show if spot is free 
	
	//this will give what type spot is there
	public Parkingspot(Spottype spottype)
	{
		this.type=spottype;
	}
	
	
	
	public Spottype getType() {
		return type;
	}
	public void setType(Spottype type) {
		this.type = type;
	}
	public Vehicles getVehicles() {
		return vehicles;
	}
	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	
	
	

}
