package com.bridgelabz.singleton;

public class LazyInitialization {

	private static LazyInitialization lazyInitialization = null;
	
	private LazyInitialization() {}
	
	public static LazyInitialization getInstance() {
		if(lazyInitialization == null) {
			lazyInitialization = new LazyInitialization();
		}
		return lazyInitialization;
	}
}
