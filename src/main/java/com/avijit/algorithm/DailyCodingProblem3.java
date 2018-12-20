/*****************************************************************************
 * FILE NAME   : DailyCodingProblem3.java
 * VERSION     : 1.0
 * AUTHOR      : avijit
 * DATE        : Dec 20, 2018
 * DESCRIPTION : daily-coding-problem
 *****************************************************************************/

/*
 * This problem was asked by Google.
 * 
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.
 * For example, given the following Node class
 * class Node:
 *    def __init__(self, val, left=None, right=None):
 *        self.val = val
 *        self.left = left
 *        self.right = right
 *        
 * The following test should pass:
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 * 
 * 			20
 * 			/\
 *		   /  \
 *		  8   22
 *       /\
 *      /  \
 *     4   12
 *          /\
 *         /  \
 *        10   14
 *    
 * */

package com.avijit.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyCodingProblem3 {

	public static void main(String[] args) {
		Node root = createTree();
		String serializedString = serialize(root).trim();
		Node deserializedTree = deserialize(new ArrayList<String>(Arrays.asList(serializedString.split(" "))));
		System.out.println(solution(deserializedTree, 4));
	}

	private static boolean solution(Node root, int required) {
		return root.getLeft().getLeft().getValue() == required;
	}

	private static Node createTree() {
		return new Node(20,
				new Node(8, new Node(4, null, null), new Node(12, new Node(10, null, null), new Node(14, null, null))),
				new Node(22, null, null));
	}

	private static String serialize(Node root) {
		StringBuilder result = new StringBuilder("");
		if (null == root) {
			return "#";
		}
		return result.append(root.getValue()).append(" ").append(serialize(root.getLeft())).append(" ")
				.append(serialize(root.getRight())).toString();
	}

	private static Node deserialize(List<String> serializedString) {
		if (serializedString.get(0).equals("#")) {
			serializedString.remove(0);
			return null;
		}
		Node root = new Node(Integer.parseInt(serializedString.get(0)));
		serializedString.remove(0);
		root.setLeft(deserialize(serializedString));
		root.setRight(deserialize(serializedString));
		return root;
	}
}

class Node {
	private int value;
	private Node left;
	private Node right;

	Node(int value) {
		this.value = value;
	}

	Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	int getValue() {
		return value;
	}

	Node getLeft() {
		return left;
	}

	void setLeft(Node left) {
		this.left = left;
	}

	Node getRight() {
		return right;
	}

	void setRight(Node right) {
		this.right = right;
	}
}