package com.bridgelabz.singleton;

public class EagerInitialization {

	private static final EagerInitialization EAGER_INITIALIZATION_INSTANCE = new EagerInitialization();
	
	private EagerInitialization() {	}
	
	public static EagerInitialization getInstance() {
		return EAGER_INITIALIZATION_INSTANCE;
	}
}
