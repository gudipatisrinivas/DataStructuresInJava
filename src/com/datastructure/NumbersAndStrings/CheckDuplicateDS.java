
package com.datastructure.NumbersAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author srinivas
 *
 *         detect duplicate in array by comparing size of List and Set since Set
 *         doesn't contain duplicate, size must be less for an array which
 *         contains duplicates
 *
 *
 */
public class CheckDuplicateDS {

	public static boolean checkDuplicateUsingSet(String[] input) {
		List<String> inputList = Arrays.asList(input);
		Set inputSet = new HashSet(inputList);
		if (inputSet.size() < inputList.size()) {
			return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputValues = { "Rob", "Chris", "Justin", "Julia", "Chris" };
		checkDuplicateUsingSet(inputValues);

	}

}
