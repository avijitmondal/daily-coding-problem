/*****************************************************************************
 * FILE NAME   : DailyCodingProblem88.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Feb 28, 2019
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This question was asked by ContextLogic.
 *
 *Implement division of two positive integers without using the division, multiplication, or modulus operators. Return the quotient as an integer, ignoring the remainder.
 * */
package com.avijit.algorithm;

public class DailyCodingProblem88 {
	public static void main(String[] args) {
		DailyCodingProblem88 problem = new DailyCodingProblem88();
		int dividend = 12;
		int divisor = 5;
		System.out.println(problem.solution(dividend, divisor));
	}

	private int solution(int dividend, int divisor) {
		int sign = 1;
		if (dividend < 0 || divisor < 0) {
			sign = -1;
		}
		int quotient = 0;
		while (dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		return sign * quotient;
	}
}
