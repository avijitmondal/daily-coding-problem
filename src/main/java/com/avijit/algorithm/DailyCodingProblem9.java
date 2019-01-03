/**
 * FILE NAME   : DailyCodingProblem9.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : 1 Jan 2019
 * DESCRIPTION : daily-coding-problem
 */

/*
 * This problem was asked by Airbnb.
 * 
 * Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
 * 
 * For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 * Follow-up: Can you do this in O(N) time and constant space?
 * */

package com.avijit.algorithm;

/**
 * @author avijit
 *
 */
public class DailyCodingProblem9 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 2, 5 };
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < arr.length; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);
	}
}
