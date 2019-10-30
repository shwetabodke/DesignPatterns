package com.bridgelabz.creationaldesignpatterns.abstractfactory;

public class PcFactory implements ComputerAbstractFactory {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PcFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
