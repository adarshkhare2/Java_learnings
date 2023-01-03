package com.parkingtask;

public class Vehicles {
	private int vehicleNo;
	private Vehicletype vehicletype;
	private Parkingspot parkingspot;
	
	//to show what kind of vehicle it is
	public Vehicles(Vehicletype vehicletype)
	{
		this.vehicletype=vehicletype;
	}
	
	
	
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Vehicletype getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(Vehicletype vehicletype) {
		this.vehicletype = vehicletype;
	}
	public Parkingspot getParkingspot() {
		return parkingspot;
	}
	public void setParkingspot(Parkingspot parkingspot) {
		this.parkingspot = parkingspot;
	}
	
}
