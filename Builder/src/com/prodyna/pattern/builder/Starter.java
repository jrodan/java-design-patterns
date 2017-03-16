package com.prodyna.pattern.builder;

public class Starter {

	public static void main(String[] args) {
		
		new VehicleDirectorImpl(new A3Builder()).construct();
		new VehicleDirectorImpl(new M3Builder()).construct();
	}

}
