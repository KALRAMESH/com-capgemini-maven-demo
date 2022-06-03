package com.capgemini.demo.comp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.capgemini.demo.hash.Employee;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList <Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(105, "sonu",60000.50));
		empList.add(new Employee(106, "monu", 50000.60));
		empList.add(new Employee(107,"kallu",40000.70));
		empList.add(new Employee(109,"golu",70000.80));
		
		System.out.println("Employees as per insertion order:");
		for(Employee emp:empList) {
			System.out.println(emp.toString());
		}
		
		//Employee class needs to implement Comparable and override compareTo
		
		Collections.sort(empList);
		
		System.out.println("Employees after sorting");
			for(Employee emp : empList) {
			System.out.println(emp.toString());
		}
	}
}


