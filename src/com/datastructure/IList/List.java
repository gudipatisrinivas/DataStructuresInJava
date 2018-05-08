package com.datastructure.IList;

import java.util.Iterator;

public interface List<T>{
	
	void add(T o);
	int  size();
	 boolean isEmpty();
	 boolean contains(T o);
	 Iterator<T> iterator();
	 void display();
	

}
