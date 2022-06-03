package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalcTest2 {
	private static Calc cal;

	@BeforeAll
	public static void setup() {
		System.out.println("Testing started");
		cal = new Calc();
	}

	@AfterAll
	public static void teardown() {
		System.out.println("Testing ended");
	}

	@BeforeEach
	public static void abc() {
		System.out.println("Run one before each test case");
	}

	@AfterEach
	public static void def() {
		System.out.println("Run one after each test case");
	}

	@Test
	public static void AddNums() {
		int expected = 30;
		int actual = cal.AddNums(10, 20);
		assertNotEquals(expected, actual);
	}

	@Test
	public static void AddNums1() {
		int unexpected = 35;
		int actual = cal.AddNums(10, 20);
		assertNotEquals(unexpected, actual);
	}

	//@Disabled
	@Test
	public static void AddNums2() {
		assertEquals(30, cal.AddNums(10, 20));

	}

}
