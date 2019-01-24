/**
 * FILE NAME   : DailyCodingProblem57.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : 23 Jan 2019
 * DESCRIPTION : daily-coding-problem
 */
/*
 * This problem was asked by Amazon.
 * 
 * Given a string s and an integer k, break up the string into multiple texts such that each text has a length of k or less. You must break it up so that words don't break across lines. If there's no way to break the text up, then return null.
 * You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.
 * 
 * For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.
 * 
 * */
package com.avijit.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author avijit
 *
 */
public class DailyCodingProblem57 {
	public static void main(String[] args) {
		int k = 10;
		String s = "the quick brown fox jumps over the lazy dog";
		System.out.println(solution(s, k));
	}

	private static List<String> solution(String s, int k) {
		List<String> result = new ArrayList<>();
		Pattern p = Pattern.compile("\\b.{1," + k + "}\\b\\W?");
		Matcher m = p.matcher(s);

		while (m.find()) {
			result.add(m.group());
		}
		return result;
	}
}
