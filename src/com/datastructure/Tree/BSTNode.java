package com.datastructure.Tree;

@SuppressWarnings("hiding")
public class BSTNode<Integer> {
	
	int type;
	BSTNode<Integer> left;
	BSTNode<Integer> right;
	
	
	public BSTNode(int type, BSTNode<Integer> left, BSTNode<Integer> right) {
		super();
		this.type = type;
		this.left = left;
		this.right = right;
	}
	
	public BSTNode(int e) {
		super();
		this.type = e;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public BSTNode<Integer> getLeft() {
		return left;
	}
	public void setLeft(BSTNode<Integer> left) {
		this.left = left;
	}
	public BSTNode<Integer> getRight() {
		return right;
	}
	public void setRight(BSTNode<Integer> right) {
		this.right = right;
	}


}
