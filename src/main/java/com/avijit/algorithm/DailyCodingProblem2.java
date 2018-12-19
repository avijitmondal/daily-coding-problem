/*
 * This problem was asked by Uber.
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 * */

package com.avijit.algorithm;

public class DailyCodingProblem2 {

	public static void main(String[] args) {
		int[] arr = { 7, 15, 10, 3 };
		arr = solution(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] solution(int[] arr) {
		int totalMultiplicationValue = 1;
		for (int i = 0; i < arr.length; i++) {
			totalMultiplicationValue *= arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = totalMultiplicationValue / arr[i];
		}
		return arr;
	}
}
