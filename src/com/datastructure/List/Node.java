package com.datastructure.List;

public class Node<E> {
	
	E obj;
	Node next;

	public Node(E o) {
		// TODO Auto-generated constructor stub
		this.obj=o;
		this.next=null;
	}
	public String getObj() {
		return obj.toString();
	}
	public void setObj(E obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Node [obj=" + obj.toString() + ", next=" + next + "]";
	}

}
