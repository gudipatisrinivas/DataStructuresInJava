package com.datastructure.Sorting;

/*The best case input is an array that is already sorted. 
 * In this case insertion sort has a linear running time (i.e., Θ(n)). 
 * During each iteration, the first remaining element of the input is only compared with the right-most element of the sorted subsection of the array. 
 * The simplest worst case input is an array sorted in reverse order. 
 * The set of all worst case inputs consists of all arrays where each element is the smallest or second-smallest of the elements before it.
 *  In these cases every iteration of the inner loop will scan and shift the entire sorted subsection of the array before inserting the next element. 
 *  This gives insertion sort a quadratic running time (i.e., O(n2)). 
 *  The average case is also quadratic, which makes insertion sort impractical for sorting large arrays.
 *   However, insertion sort is one of the fastest algorithms for sorting very small arrays, even faster than quicksort; 
 *   indeed, good quicksort implementations use insertion sort for arrays smaller than a certain threshold, 
 *   also when arising as subproblems; the exact threshold must be determined experimentally and depends on the machine, 
 *   but is commonly around ten.
*/

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,3,2,5,6,7,12};
		sort(a);

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j,j-1);
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
