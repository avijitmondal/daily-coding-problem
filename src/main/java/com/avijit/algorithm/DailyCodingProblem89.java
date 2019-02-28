/*****************************************************************************
 * FILE NAME   : DailyCodingProblem89.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Feb 28, 2019
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This problem was asked by LinkedIn.
 *
 *Determine whether a tree is a valid binary search tree.
 *
 *A binary search tree is a tree with two children, left and right, and satisfies the constraint that the key in the left child must be less than or equal to the root and the key in the right child must be greater than or equal to the root.
 * */
package com.avijit.algorithm;

public class DailyCodingProblem89 {
	public static void main(String[] args) {
		DailyCodingProblem89 problem = new DailyCodingProblem89();
		Node root = problem.createTree();
		System.out.println(problem.solution(root));
	}

	private boolean solution(Node root) {
		if (root.getLeft() == null) {
			return true;
		} else if (root.getValue() < root.getLeft().getValue() || !solution(root.getLeft())) {
			return false;
		}
		if (root.getRight() == null) {
			return true;
		} else if (root.getValue() > root.getRight().getValue() || !solution(root.getRight())) {
			return false;
		}
		return true;
	}
	
	private Node createTree() {
		return new Node(20,
				new Node(8, new Node(4, null, null), new Node(12, new Node(10, null, null), new Node(14, null, null))),
				new Node(22, null, null));
	}
}
