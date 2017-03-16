package com.prodyna.pattern.builder;

public class VehicleImpl implements Vehicle {
	
	private int wheels;
	private int gears;
	private StringBuilder sb = new StringBuilder();
	
	public VehicleImpl() {
	}

	@Override
	public int getWheels() {
		return wheels;
	}
	
	@Override
	public void setWheels(int wheels) {
		this.wheels = wheels;
		this.sb.append("{wheels: "+this.getWheels()+"}");
	}
	
	@Override
	public void setGears(int gears) {
		this.gears = gears;
		this.sb.append("{gears: "+this.getGears()+"}");
	}

	@Override
	public int getGears() {
		return gears;
	}
	
	public String toString() {
		return "{"+ this.sb.toString() + "}";
	}

}
