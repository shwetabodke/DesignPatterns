package com.bridgelabz.creationaldesignpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> employeeNames;

	public Employee() {
		employeeNames = new ArrayList<>();
	}

	public Employee(List<String> employeeNames) {
		this.employeeNames = employeeNames;
	}
	
	public void loadData() {
		employeeNames.add("Pankaj");
		employeeNames.add("Aniket");
		employeeNames.add("Jaspreet");
		employeeNames.add("Deepu");
		employeeNames.add("Rohan");
	}
	
	public List<String> getEmployeeNames() {
		return employeeNames;
	}

	public void setEmployeeNames(List<String> employeeNames) {
		this.employeeNames = employeeNames;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		/* Shalow Clonning */
//		return super.clone();
	
		/* Deep Clonning */
		List<String> empCloned = new ArrayList<>();
		for (String string : employeeNames) {
			empCloned.add(string);
		}
		
		return new Employee(empCloned);
	}
	
}
