package com.bridgelabz.creationaldesignpatterns.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		Computer computer = ComputerFactory.getComputer(new PcFactory("4 GB", "1 TB", "2.4 GHz"));
		Computer computer2 = ComputerFactory.getComputer(new ServerFactory("2 GB", "500 GB", "4.8 GHz"));
		System.out.println(computer.toString());
		System.out.println(computer2.toString());
	
	}
}
