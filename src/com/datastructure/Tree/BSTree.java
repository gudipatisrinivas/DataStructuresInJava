package com.datastructure.Tree;

/** 
 * http://www.sanfoundry.com/java-program-implement-binary-search-tree/**/

public class BSTree<Integer> implements Tree {

	BSTNode<Integer> root;

	@Override
	public void add(int e) {
		// TODO Auto-generated method stub

		insert(root, e);
	}

	private BSTNode<Integer> insert(BSTNode<Integer> node, int e) {
		if (node == null) {
			root = new BSTNode<>(e);
		} else if (node.getType() < e) {
			node.left = insert(node.getLeft(), e);

		} else if (node.getType() > e) {
			node.right = insert(node.getRight(), e);
		}
		return node;
	}

	@Override
	public void display(int bt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int e) {
		// TODO Auto-generated method stub

	}

	@Override
	public int search(int e) {
		// TODO Auto-generated method stub
		return 0;
	}

}
