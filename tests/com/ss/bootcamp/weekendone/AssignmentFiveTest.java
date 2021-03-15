/**
 * 
 */
package com.ss.bootcamp.weekendone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for week one assignment, assignment 5
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentFiveTest {

	@Test
	public void test1() {
		int[] input = {2, 4, 8};
		assertTrue(AssignmentFive.groupClumpSum(0, input, 10));
	}
	
	@Test
	public void test2() {
		int[] input = {1, 2, 4, 8, 1};
		assertTrue(AssignmentFive.groupClumpSum(0, input, 14));
	}
	
	@Test
	public void test3() {
		 int[] input = {2, 4, 4, 8};
		 assertFalse(AssignmentFive.groupClumpSum(0, input, 14));
	}
	
	@Test
	public void test4() {
		 int[] input = {2, 2, 2, 2};
		 assertTrue(AssignmentFive.groupClumpSum(0, input, 8));
	}
	
	@Test
	public void test5() {
		 int[] input = {2, 2, 1, 2};
		 assertFalse(AssignmentFive.groupClumpSum(0, input, 8));
	}
	
	@Test
	public void test6() {
		 int[] input = {2, 2, 1, 2, 1};
		 assertTrue(AssignmentFive.groupClumpSum(0, input, 8));
	}
	
	@Test
	public void test7() {
		 int[] input = {2};
		 assertFalse(AssignmentFive.groupClumpSum(0, input, 1));
	}
	
	@Test
	public void test8() {
		 int[] input = {2};
		 assertTrue(AssignmentFive.groupClumpSum(0, input, 2));
	}
	
	@Test
	public void test9() {
		 int[] input = {5,1,10,3,5,6};
		 assertTrue(AssignmentFive.groupClumpSum(0, input, 11));
	}
	
	@Test
	public void test10() {
		 int[] input = {10};
		 assertFalse(AssignmentFive.groupClumpSum(0, input, 1));
	}
	
	
}
