/**
 * 
 */
package com.datastructure.NumbersAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mounikasrinivas Frequency of integers in array
 *
 */
public class FrequencyOfIntegers {

	public void printCopies(int[] array) {
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
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	public static void main(String s[]) {
		int[] array = { 1, 2, 3, 4, 5, 6, 8, 10, 5, 2, 3, 5 };
		FrequencyOfIntegers frequency = new FrequencyOfIntegers();
		frequency.printCopies(array);
	}

}
