package com.datastructure.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList();
		ll.add("Srinivas");
		ll.add("Mounika");
		ll.add("Sriya");
		ll.add("Padma");
		System.out.println(ll.isEmpty());
		System.out.println(ll.size());
		ll.display();

	}

}
