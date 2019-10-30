package com.bridgelabz.singleton;

public class BillPughSingletonTest {

	public static void main(String[] args) {
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();

		System.out.println("First object" + billPughSingleton.hashCode());
		System.out.println("Second object" + billPughSingleton1.hashCode());

	}
}
