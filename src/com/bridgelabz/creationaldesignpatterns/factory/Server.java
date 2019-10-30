package com.bridgelabz.creationaldesignpatterns.factory;

public class Server extends Computer {
	
	private String ram;
	
	private String hdd;

	public Server(String ram, String hdd) {
		super();
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String getRam() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + "]";
	}

}
