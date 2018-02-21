package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test sum_with3numbers()");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with1numbers() {
		System.out.println("Test sum_with1numbers()");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}
	
	@Test
	public void sum_with0numbers() {
		System.out.println("Test sum_with0numbers()");
		assertEquals(0, myMath.sum(new int[] {}));
	}

}
