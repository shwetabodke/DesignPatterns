package com.bridgelabz.singleton;

public class EagerInitializationTest {

	public static void main(String[] args) {
		
		EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();
		EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();

		if(eagerInitialization1.hashCode() == eagerInitialization2.hashCode()) {
			System.out.println(eagerInitialization1.hashCode());
			System.out.println(eagerInitialization2.hashCode());
			System.out.println("Similar instance");
		}else {
			System.out.println("Different Instance");
		}
		
	}

}
