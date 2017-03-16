package com.prodyna.pattern.builder;

public interface VehicleBuilder {
	
	void buildWheels();
	void buildGears();
	Vehicle getVehicle();
	
}
