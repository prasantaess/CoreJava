package com.qa;

class phone{
	
	private String OS;
	private int Ram;
	private int Camera;
	private int battery;
	private double cost;
	
	public phone(String oS, int ram, int camera, int battery, double cost) {
		super();
		OS = oS;
		Ram = ram;
		Camera = camera;
		this.battery = battery;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "phone [OS=" + OS + ", Ram=" + Ram + ", Camera=" + Camera + ", battery=" + battery + ", cost=" + cost
				+ "]";
	}

}



final class phoneBuilder{

	private String OS;
	private int Ram;
	private int Camera;
	private int battery;
	private double cost;
	
	

	public phoneBuilder() {
		// TODO Auto-generated constructor stub
	}

	public phoneBuilder setOS(String oS) {
		this.OS = oS;
		return this;
	}
	
	public phoneBuilder setRam(int ram) {
		this.Ram = ram;
		return this;
	}
	
	public phoneBuilder setCamera(int camera) {
		this.Camera = camera;
		return this;
	}
	
	public phoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public phoneBuilder setCost(double cost) {
		this.cost = cost;
		return this;
	}

	
public 	phone getphone() {
	return new phone(OS,Ram,Camera,battery,cost);
}
}



public class BuilderPattern {
	public static void main(String[] args) {
	
		phone p= new phoneBuilder().setOS("Android").getphone();
		System.out.println(p);
	}
	

}
