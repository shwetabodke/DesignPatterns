package com.bridgelabz.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton = null;

	private ThreadSafeSingleton() {
	}

	public static ThreadSafeSingleton getInstance() {
		if (threadSafeSingleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (threadSafeSingleton == null) {
					threadSafeSingleton = new ThreadSafeSingleton();
					return threadSafeSingleton;
				}
			}
		}
		return threadSafeSingleton;
	}
}
