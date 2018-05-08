/**
 * 
 */
package com.datastructure.NumbersAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mounikasrinivas
 *
 */
public class FindDuplicateUnsortedArray {

	public void printDuplicates(int[] array) {
		HashMap<Integer, Integer> memberMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!memberMap.containsKey(array[i])) {
				memberMap.put(array[i], 1);
			} else {
				int temp = memberMap.get(array[i]);
				memberMap.put(array[i], ++temp);
			}
		}

		for (Map.Entry<Integer, Integer> entry : memberMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1 };
		FindDuplicateUnsortedArray findDuplicateUnsortedArray = new FindDuplicateUnsortedArray();

		findDuplicateUnsortedArray.printDuplicates(array);

	}

}
