package com.bridgelabz.creationaldesignpatterns.factory;

public class TestComputerFactory {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer("PC", "4GB", "1TB");
		Computer computer2 = ComputerFactory.getComputer("SERVER", "2GB", "500GB");
		System.out.println(computer.toString());
		System.out.println(computer2.toString());
		String.valueOf(false);
	}

}
