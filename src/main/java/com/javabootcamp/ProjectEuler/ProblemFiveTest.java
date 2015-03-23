package com.javabootcamp.ProjectEuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemFiveTest {
	
	@Test
	public void testIsAnswerForTwo() {
		ProblemFive problemFive = new ProblemFive(2);
		assertFalse(problemFive.isAnswer(1));
		assertTrue(problemFive.isAnswer(2));
	}
	@Test
	public void testFindAnswerForThree() {
		ProblemFive problemFive = new ProblemFive(3);
		assertEquals(6, problemFive.findAnswer());
	}
	@Test
	public void testFindAnswerForZero() {
		ProblemFive problemFive = new ProblemFive(0);
		assertEquals(0, problemFive.findAnswer());
	}
	@Test
	public void testFindAnswerNegativeNumber() {
		ProblemFive problemFive = new ProblemFive(-1);
		assertEquals(0, problemFive.findAnswer());
	}
}
