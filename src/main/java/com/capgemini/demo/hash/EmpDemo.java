package com.capgemini.demo.hash;

public class EmpDemo {
public static void main(String[] args) {
	Employee emp = new Employee(101,"sonu",50000);
	Employee emp2 = new Employee(101,"sonu",50000);
	//Em[ployee emp2 = new Employee(103,"golu",54000);
	
	System.out.println(emp.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp.equals(emp2));
}
}
