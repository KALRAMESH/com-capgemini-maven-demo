package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import com.capgemini.demo.Calc;

public class CalcTest {
	@Test
	public void AddNums() {
		Calc cal=new Calc();
		int expected = 30;
		int actual = cal.AddNums(10,20);
		assertEquals(expected,actual);
	}
	@Test
	public void AddNums1() {
		Calc cal=new Calc();
		int unexpected = 35;
		int actual = cal.AddNums(10,20);
		assertNotEquals(unexpected,actual);
	
}
	@Test
	public void AddNums2() {
		Calc cal=new Calc();
		assertEquals(30,cal.AddNums(10,20));
	}
}