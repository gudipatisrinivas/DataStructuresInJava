package com.datastructure.Sorting;

/*Bubble sort has worst-case and average complexity both О(n2), where n is the number of items being sorted. There exist many sorting algorithms with substantially better worst-case or average complexity of O(n log n). 
 * Even other О(n2) sorting algorithms,
 * such as insertion sort, 
 * tend to have better performance than bubble sort.
 *  Therefore, bubble sort is not a practical sorting algorithm 
 *  when n is large.Performance of bubble sort 
 *  over an already-sorted list (best-case) is O(n).
*/

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,3,2,5,6,7,12};
		sort(a);

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
		printArray(a);
		
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int each:a) {
			System.out.print(each+" ");
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}

}
