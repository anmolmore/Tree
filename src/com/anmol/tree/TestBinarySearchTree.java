package com.anmol.tree;

public class TestBinarySearchTree {
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(45);
		tree.insert(78);
		tree.insert(12);
		tree.insert(3);
		tree.insert(89);
		
		System.out.println(tree);
	}

}
