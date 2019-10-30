package com.bridgelabz.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton staticBlockSingleton;
	
	private StaticBlockSingleton() {}

    //static block initialization for exception handling
	static {
		try {
			staticBlockSingleton = new StaticBlockSingleton();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception Occurred while creating a singleton object");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return staticBlockSingleton;
	}
}
