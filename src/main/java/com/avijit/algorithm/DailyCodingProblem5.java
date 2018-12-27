/*****************************************************************************
 * FILE NAME   : DailyCodingProblem5.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : 27 Dec 2018
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 * This problem was asked by Jane Street.
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 * Given this implementation of cons:
 * def cons(a, b):
 *    def pair(f):
 *       return f(a, b)
 *    return pair
 *    
 *Implement car and cdr.
 **/
package com.avijit.algorithm;

/**
 * @author avijit
 *
 */
public class DailyCodingProblem5 {
	public static void main(String[] args) {
		System.out.println(solution());
	}

	private static int solution() {
		return car(cdr(3, 4));
//		return cdr(car(3, 4));
	}

	private static int car(int... pair) {
		return pair[0];
	}

	private static int cdr(int... pair) {
		return pair.length == 1 ? pair[0] : pair[1];
	}
}
