package com.javabootcamp.ProjectEuler;

public class ProblemFive {

	public ProblemFive(int largestDivisor) {
		mLargestDivisor = largestDivisor;
	}
	protected int mLargestDivisor;
	
	public boolean isAnswer(int number) {
		if(number <= 0) return false;
		for(int i = 1; i <= mLargestDivisor; i++){
			if(number % i!= 0){
				return false;
			}
		}
		return true;
	}

	public int findAnswer() {
		if(mLargestDivisor <= 0) return 0;
		for (int i = 0;; i++) {
			if (isAnswer(i)) {
				return i;
			}
		}
	}

	public static void main(String[] args) {
		ProblemFive solution = new ProblemFive(20);
		System.out.println(solution.findAnswer());
	}

}
