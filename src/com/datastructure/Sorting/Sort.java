package com.datastructure.Sorting;

public abstract class Sort {
	
	abstract void sort(int[] a);
	
	
	protected void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int each:a) {
			System.out.print(each+" ");
		}
		
	}

	protected void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
