package com.javabootcamp.ProjectEuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemOneTest {
	Integer expected;
	Integer actual;
	
	@Test
	public void testNegativeNumber() {
		ProblemOne problemOne = new ProblemOne();
		actual = problemOne.numberMultiples(-10);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testZero() {
		ProblemOne problemOne = new ProblemOne();
		actual = problemOne.numberMultiples(0);
		expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneThroughNine() {
		ProblemOne problemOne = new ProblemOne();
		actual = problemOne.numberMultiples(10);
		expected = 23;
		assertEquals(expected, actual);
	}
	@Test
	public void testOneThrough99() {
		ProblemOne problemOne = new ProblemOne();
		actual = problemOne.numberMultiples(100);
		expected = 2318;
		assertEquals(expected, actual);
	}
	@Test
	public void testOneThrough499() {
		ProblemOne problemOne = new ProblemOne();
		actual = problemOne.numberMultiples(500);
		expected = 57918;
		assertEquals(expected, actual);
	}
}
