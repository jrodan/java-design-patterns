package com.prodyna.pattern.builder;

public class M3Builder extends VehicleBuilderImpl implements VehicleBuilder {
	
	@Override
	public void buildGears() {
		this.getVehicle().setGears(5);
	}
}
