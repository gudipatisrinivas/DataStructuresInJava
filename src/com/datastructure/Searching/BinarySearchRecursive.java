package com.datastructure.Searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 5, 7, 8 };
		BinarySearch bst = new BinarySearch();
		int element = 222;
		int value = bst.runBinarySearchIteratively(a, element, 0, a.length - 1);
		if(a[value]==element) {
		System.out.println("Value" + value);
		}

	}
	
	public int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
			    int middle = (low + high) / 2;
			         
			    if (high < low) {
			        return -1;
			    }
			 
			    if (key == sortedArray[middle]) {
			        return middle;
			    } else if (key < sortedArray[middle]) {
			        return runBinarySearchRecursively(
			          sortedArray, key, low, middle - 1);
			    } else {
			        return runBinarySearchRecursively(
			          sortedArray, key, middle + 1, high);
			    }
			}

}
