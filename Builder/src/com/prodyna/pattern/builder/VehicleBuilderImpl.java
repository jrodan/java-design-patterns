package com.prodyna.pattern.builder;

public abstract class VehicleBuilderImpl implements VehicleBuilder {

	private Vehicle v = new VehicleImpl();
	
	@Override
	public void buildWheels() {
		this.v.setGears(3);
	}

	@Override
	public void buildGears() {
		this.v.setWheels(5);
	}
	
	@Override
	public Vehicle getVehicle() {
		return this.v;
	}

}
