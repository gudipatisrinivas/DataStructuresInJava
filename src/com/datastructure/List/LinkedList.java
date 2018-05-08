package com.datastructure.List;

import java.util.Iterator;

import com.datastructure.IList.List;

public class LinkedList<E> implements List<E> {
	
	Node<?> firstLink;
	Node<?> currentLink;
	
	@Override
	public void add(E o) {
		// TODO Auto-generated method stub
		
		Node<E> newLink=new Node<>(o);
		if(firstLink==null) {
			firstLink=newLink;
			currentLink=newLink;
			
		}else {
			currentLink.next=newLink;
			currentLink=newLink;
			
		}
		
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		Node<?> temp= firstLink;
		int counter=0;
		while(temp.next!=null) {
			counter++;
			temp=temp.next;
		}
		return counter+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean flag=true;
		Node<?> temp=firstLink;
		if(temp.next!=null) {
			flag=false;
		}
		return flag;
	}

	@Override
	public boolean contains(E o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Node temp=firstLink;
		do {
			System.out.println(temp.getObj());
			temp=temp.next;
		}while( temp!=null);
		
	}

}
