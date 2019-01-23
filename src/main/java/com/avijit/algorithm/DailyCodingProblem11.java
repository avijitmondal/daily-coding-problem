/**
 * FILE NAME   : DailyCodingProblem11.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : 3 Jan 2019
 * DESCRIPTION : daily-coding-problem
 */

/*
 * This problem was asked by Twitter.
 * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 * 
 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 * 
 * */
package com.avijit.algorithm;

import java.util.Arrays;

/**
 * @author avijit
 *
 */
public class DailyCodingProblem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = { "dog", "deer", "deal" };
		String prefix = "do";
		System.out.println(Arrays.deepToString(solution(arr, prefix)));
	}

	private static String[] solution(String[] arr, String prefix) {
		String[] result = new String[arr.length];
		int count = 0;
		for (String a : arr) {
			if (a.startsWith(prefix)) {
				result[count++] = a;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
