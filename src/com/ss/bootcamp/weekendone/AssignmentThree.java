/**
 * 
 */
package com.ss.bootcamp.weekendone;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Week one assignment, assignment 3
 * @author Bill Shi
 * 3/14/21
 * 
 */
public class AssignmentThree {

	/**
	 * Takes a list of numbers and returns a list where each number
	 * is doubled
	 * @param nums
	 * @return List<Integer>
	 */
	public static List<Integer> doubling(List<Integer> nums) {
		return nums.stream()
				   .map(i -> i + i)
				   .collect(toList());
	}
	
}
