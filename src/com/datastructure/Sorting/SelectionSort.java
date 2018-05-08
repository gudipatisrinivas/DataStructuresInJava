package com.datastructure.Sorting;

public class SelectionSort extends Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 3, 2, 5, 6, 7, 12 };
		SelectionSort sc = new SelectionSort();
		sc.sort(a);

	}

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;
			swap(arr, i, index);

		}

	}

}
