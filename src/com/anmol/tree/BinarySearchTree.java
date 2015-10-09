package com.anmol.tree;

/**
 * @see http://www.javabeat.net/binary-search-tree-traversal-java/
 * @author anmmore
 *
 */
public class BinarySearchTree {
	public Node root;
	
	public void insert(int value) {
		Node node = new Node(value);
		
		if(root == null) {
			root = node;
			return;
		}
		insertRec(root, node);
	}

	private void insertRec(Node currentRoot, Node node) {
		if(currentRoot.value > node.value) {
			if(currentRoot.left == null) {
				currentRoot.left = node;
				return;
			}
			else {
				insertRec(currentRoot.left,node);
			}
		}
		else {
			if(currentRoot.right == null) {
				currentRoot.right = node;
			}
			else {
				insertRec(currentRoot.right, node);
			}
		}
	}
}
