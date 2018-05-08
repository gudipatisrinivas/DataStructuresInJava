/**
 * @author srinivas
 * 
 *         brute force way of checking if array contains duplicates in Java
 *         comparing each elements to all other elements of array complexity on
 *         order of O(n^2) not advised in production
 *
 * 
 */
package com.datastructure.NumbersAndStrings;
public class FindDuplicateValue {
	public static boolean bruteforce(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i].equalsIgnoreCase(input[j]) && i != j) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String s[]) {
		String[] inputValues = { "Rob", "Chris", "Justin", "Julia", "Chris" };
		bruteforce(inputValues);

	}

}
