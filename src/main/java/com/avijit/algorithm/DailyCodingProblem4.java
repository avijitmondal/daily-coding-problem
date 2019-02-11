/*****************************************************************************
 * FILE NAME   : DailyCodingProblem4.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : 20 Dec 2018
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This problem was asked by Stripe.
 *Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *You can modify the input array in-place. 
 * */
package com.avijit.algorithm;

/**
 * @author avijit
 *
 */
public class DailyCodingProblem4 {
	public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 8, -1, -10, 15};

		System.out.println(solution(arr, arr.length));
	}

	private static int solution(int[] arr, int n) {
		int val;

		int nextval;

		for (int i = 0; i < n; i++) {

			if (arr[i] <= 0 || arr[i] > n) {
				continue;
			}

			val = arr[i];

			while (arr[val - 1] != val) {
				nextval = arr[val - 1];
				arr[val - 1] = val;
				val = nextval;
				if (val <= 0 || val > n) {
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}
}
