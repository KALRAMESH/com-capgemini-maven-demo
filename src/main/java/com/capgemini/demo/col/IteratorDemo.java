package com.capgemini.demo.col;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sonu");
		list.add("Monu");
		list.add("Ponu");
		list.add("Donu");
		System.out.println(list);
		System.out.println("iterator using for loop");
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("iterator using for each loop");
		for (String elem : list) {
			System.out.println(elem);
		}
		System.out.println("iterator using iterator");
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.hasNext());

		}
	}

}
