package com.capgemini.demo.col;
import java.util.ArrayList;
import java.util.List;
public class DemoJava2 {
	public static void main(String[] args) {
	

	ArrayList<Integer>List=new ArrayList<>();
	//add element
	List.add(1);
	List.add(2);
	List.add(3);
	System.out.println(List);
	
	//get element
	Integer element=List.get(2);
	Integer element1=List.get(0);
	Integer element2=List.get(1);
	System.out.println(element);
	
	//set element
	List.set(0,2);
	List.set(1, 5);
	System.out.println(element);
	
	}
}
