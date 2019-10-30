package com.bridgelabz.creationaldesignpatterns.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("2 GB", "4 GB")
										.setBluetoothEnabled(true)
										.setGraphicCardEnabled(false)
										.build();
		
		System.out.println(computer.toString());
	}

}
