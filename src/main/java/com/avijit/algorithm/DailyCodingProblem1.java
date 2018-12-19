/*
 * This problem was recently asked by Google.
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * 
 * Bonus: Can you do this in one pass?
 * */

package com.avijit.algorithm;

public class DailyCodingProblem1 {

	public static void main(String[] args) {
		int k = 17;
		int[] arr = { 7, 15, 10, 3 };
		System.out.println(solution(arr, k));
	}

	private static boolean solution(int[] arr, int k) {
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (k < arr[i] + arr[j]) {
				i++;
			} else if (k > arr[i] + arr[j]) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}
}
