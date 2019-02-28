/*****************************************************************************
 * FILE NAME   : DailyCodingProblem86.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Feb 28, 2019
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This problem was asked by Google.
 *
 *Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make the string valid (i.e. each open parenthesis is eventually closed).
 *
 *For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2, since we must remove all of them.
 * */
package com.avijit.algorithm;

import java.util.Stack;

public class DailyCodingProblem86 {
	public static void main(String[] args) {
		DailyCodingProblem86 problem = new DailyCodingProblem86();
		String parentheses = "()())()"; // OP 1
//		String parentheses = ")("; // OP 2
		System.out.println(problem.solution(parentheses));
	}

	private int solution(String parentheses) {
		char arr[] = parentheses.toCharArray();
		Stack<Character> parenthesesSet = new Stack<>();
		int removableParanthesis = 0;
		for (char item : arr) {
			if (item == '(') {
				parenthesesSet.push(item);
			} else if (!parenthesesSet.isEmpty() && parenthesesSet.peek() == '(') {
				parenthesesSet.pop();
			} else {
				removableParanthesis++;
			}
		}
		return parenthesesSet.size() + removableParanthesis;
	}
}
