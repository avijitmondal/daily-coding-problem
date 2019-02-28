/*****************************************************************************
 * FILE NAME   : DailyCodingProblem92.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Feb 28, 2019
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This problem was asked by Airbnb.
 *We're given a hashmap associating each courseId key with a list of courseIds values, which represents that the prerequisites of courseId are courseIds. Return a sorted ordering of courses such that we can finish all courses.
 *
 *Return null if there is no such ordering.
 *
 *For example, given {'CSC300': ['CSC100', 'CSC200'], 'CSC200': ['CSC100'], 'CSC100': []}, should return ['CSC100', 'CSC200', 'CSCS300'].
 * */
package com.avijit.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class DailyCodingProblem92 {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> alCSC300 = new ArrayList<String>();
		alCSC300.add("CSC100");
		alCSC300.add("CSC200");
		map.put("CSC300", alCSC300);

		List<String> alCSC200 = new ArrayList<String>();
		alCSC300.add("CSC100");
		map.put("CSC200", alCSC200);

		List<String> alCSC100 = new ArrayList<String>();
		map.put("CSC100", alCSC100);

		System.out.println(solution(map));
	}

	private static SortedSet<String> solution(Map<String, List<String>> map) {
		SortedSet<String> set = new TreeSet<>();
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			set.add(entry.getKey());
			for (String value : entry.getValue()) {
				set.add(value);
			}
		}
		return set.isEmpty() ? null : set;
	}
}
