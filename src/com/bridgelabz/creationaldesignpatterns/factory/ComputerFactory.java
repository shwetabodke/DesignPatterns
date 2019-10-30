package com.bridgelabz.creationaldesignpatterns.factory;

public class ComputerFactory {
	
	public static Computer getComputer(String input, String ram, String hdd) {
		
		if(input.equalsIgnoreCase("PC")) {
			return new PC(ram, hdd);
		} else if(input.equalsIgnoreCase("SERVER")){
			return new Server(ram, hdd);
		} else {
			return null;
		}
	}

}
