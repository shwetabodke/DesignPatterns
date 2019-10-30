package com.bridgelabz.singleton;

public class ThreadSafeSingletonTest {

	public static void main(String[] args) {

		ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();

		ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();

		if (threadSafeSingleton1.hashCode() == threadSafeSingleton2.hashCode()) {
			System.out.println("Similar instance..");
		} else {
			System.out.println("Different instance..");
		}
	}
}
