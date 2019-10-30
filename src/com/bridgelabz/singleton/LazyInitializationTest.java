package com.bridgelabz.singleton;

public class LazyInitializationTest {

	public static void main(String[] args) {
		
		LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
		LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();
		
		if(lazyInitialization1.hashCode() == lazyInitialization2.hashCode()) {
			System.out.println("Similar instance..");
		}else {
			System.out.println("Different instance..");
		}
	}
}
