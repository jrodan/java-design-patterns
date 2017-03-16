package com.prodyna.pattern.builder;

public class VehicleDirectorImpl implements VehicleDirector {

	VehicleBuilder vb = null;

	public VehicleDirectorImpl(VehicleBuilder vb) {
		this.vb = vb;
	}

	@Override
	public Vehicle construct() {

		this.vb.buildGears();
		this.vb.buildWheels();
		Vehicle v = this.vb.getVehicle();

		System.out.println("created Vehicle " + v.toString());

		return v;
	}

}
