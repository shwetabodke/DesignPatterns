package com.bridgelabz.singleton;

public class StaticBlockSingletonTest {

	public static void main(String[] args) {

		StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();

		StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

		if (staticBlockSingleton1.hashCode() == staticBlockSingleton2.hashCode()) {
			System.out.println("Similar Instance");
		} else {
			System.out.println("Different Instance");
		}

	}
}
