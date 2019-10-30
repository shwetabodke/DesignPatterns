package com.bridgelabz.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {}

	private static class SingletonHelper {
		private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.billPughSingleton;
	}

}
