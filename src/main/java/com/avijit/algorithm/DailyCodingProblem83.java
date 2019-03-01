/*****************************************************************************
 * FILE NAME   : DailyCodingProblem83.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Mar 1, 2019
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 *This problem was asked by Google.
 *
 *Invert a binary tree.
 *
 *For example, given the following tree:
 *          a
 *         / \
 *        b   c
 *       / \  /
 *      d   e f
 *      
 *      should become:
 *      
 *         a
 *       /  \
 *      c    b
 *      \   / \
 *       f e   d
 *       
 * */
package com.avijit.algorithm;

public class DailyCodingProblem83 {
	public static void main(String[] args) {
		DailyCodingProblem83 problem = new DailyCodingProblem83();
		Node root = problem.createTree(); 
		problem.preorder(root);
		problem.solution(root);
		System.out.println();
		problem.preorder(root);
	}

	private void solution(Node root) {
		if(root == null) {
			return;
		}
		solution(root.getLeft());
		solution(root.getRight());
		
		Node temp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
	}
	
	private Node createTree() {
		return new Node(20,
				new Node(8, new Node(4, null, null), new Node(12, new Node(10, null, null), new Node(14, null, null))),
				new Node(22, null, null));
	}
	
	private void preorder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.getValue() + " ");
		preorder(root.getLeft());
		preorder(root.getRight());
	}
}
