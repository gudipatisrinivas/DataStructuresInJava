package com.datastructure.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 4, 5, 7, 8 };
		BinarySearch bst = new BinarySearch();
		int element = 222;
		int value = bst.runBinarySearchIteratively(a, element, 0, a.length-1);
		System.out.println("Value" + value);
	}

	/**
	 * @param a
	 * @param pivot
	 */
	public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			System.out.println("Sorted Array" + sortedArray[mid] + "Key" + key);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}
}
