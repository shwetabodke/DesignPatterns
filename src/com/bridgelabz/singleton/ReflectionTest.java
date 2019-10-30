package com.bridgelabz.singleton;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) {
		EagerInitialization instance1 = EagerInitialization.getInstance();
		EagerInitialization instance2 = null;
		try {
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
		    	constructor.setAccessible(true);
				instance2 = (EagerInitialization) constructor.newInstance();
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		
	}
}
