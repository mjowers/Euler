package com.javabootcamp.ProjectEuler;

public class ProblemOne {
	public int numberMultiples(int number) {
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		ProblemOne solution = new ProblemOne();
		System.out.println(solution.numberMultiples(1000));
	}

}
