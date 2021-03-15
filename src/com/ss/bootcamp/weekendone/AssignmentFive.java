/**
 * 
 */
package com.ss.bootcamp.weekendone;

/**
 * Week one assignment, assignment 4
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentFive {

	/**
	 * recursively determine if it's possible to choose a group of 'clumps'
	 * that sums to the target.
	 * identical, adjacent numbers form a 'clump'
	 * @param from
	 * @param nums
	 * @param target
	 * @return boolean
	 */
	public static boolean groupClumpSum(int from, int[] nums, int target) {

		if (target < 0) {
			return false;
		}

		if (target == 0) {
			return true;
		}

		for (int i = from; i < nums.length; i++) {

			int clump = nums[i];
			while (i < nums.length-1 && nums[i] == nums[i + 1]) {
				clump += nums[i];
				i++;
			}

			if (groupClumpSum(i+1, nums, target - clump))
				return true;

		}
		
		return false;
	}
	
}
