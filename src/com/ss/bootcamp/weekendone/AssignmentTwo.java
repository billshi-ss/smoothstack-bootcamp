/**
 * 
 */
package com.ss.bootcamp.weekendone;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * End of week one assignment, assignment 2 
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentTwo {
	
	/**
	 * Take a list of numbers and return a list of the rightmost
	 * digits of the given numbers
	 * @param nums
	 * @return List<Integer>
	 */
	public static List<Integer> rightDigit(List<Integer> nums) {
		return nums.stream()
				   .map(i -> i % 10)
				   .collect(toList());
	}

}
