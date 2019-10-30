package com.bridgelabz.creationaldesignpatterns.prototype;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee employee = new Employee();
		employee.loadData();
		
		Employee empCloned = (Employee) employee.clone();
		Employee empCloned1 = (Employee) employee.clone();
		
		
		List<String> empsCloned = empCloned.getEmployeeNames();
		empsCloned.remove("Pankaj");
		empsCloned.add("Jotiram");
		
		System.out.println("Original Object");
		empsCloned.parallelStream().forEach(System.out::println);
		
		System.out.println("Cloned Object");
		List<String> empsCloned1 = empCloned1.getEmployeeNames();
		empsCloned1.remove("Rohan");
		empsCloned1.parallelStream().forEach(System.out::println);
		
		System.out.println("Original Object");
		empsCloned.parallelStream().forEach(System.out::println);
		
		System.out.println("Cloned hashcode" + empCloned.getEmployeeNames().hashCode());
		System.out.println("Original hashcode" + employee.getEmployeeNames().hashCode());
		
	}

}
