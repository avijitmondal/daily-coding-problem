package com.avijit.algorithm;

public class GraphTraversal {
	
	public static void main(String[] args) {
		GraphTraversal graph = new GraphTraversal();
		Node root = graph.createTree();
		graph.inorder(root);
		System.out.println();
		graph.preorder(root);
		System.out.println();
		graph.postorder(root);
	}
	
	Node createTree() {
		return new Node(20,
				new Node(8, new Node(4, null, null), new Node(12, new Node(10, null, null), new Node(14, null, null))),
				new Node(22, null, null));
	}

	void preorder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.getValue() + " ");
		preorder(root.getLeft());
		preorder(root.getRight());
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.getLeft());
		System.out.print(root.getValue() + " ");
		inorder(root.getRight());
	}

	void postorder(Node root) {
		if (root == null) {
			return;
		}

		postorder(root.getLeft());
		postorder(root.getRight());
		System.out.print(root.getValue() + " ");
	}
}
