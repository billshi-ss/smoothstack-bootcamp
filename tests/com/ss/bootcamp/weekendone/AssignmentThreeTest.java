/**
 * 
 */
package com.ss.bootcamp.weekendone;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for week one assignment, assignment 3
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentThreeTest {

	@Test
	public void test1() {
		List<Integer> input = Arrays.asList();
		List<Integer> correctOutput = Arrays.asList();
		List<Integer> output = AssignmentThree.doubling(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test2() {
		List<Integer> input = Arrays.asList(1, 2, 3);
		List<Integer> correctOutput = Arrays.asList(2, 4, 6);
		List<Integer> output = AssignmentThree.doubling(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test3() {
		List<Integer> input = Arrays.asList(6, 8, 6, 8, -1);
		List<Integer> correctOutput = Arrays.asList(12, 16, 12, 16, -2);
		List<Integer> output = AssignmentThree.doubling(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test4() {
		List<Integer> input = Arrays.asList(12, -4, 3, 5, 0, 36);
		List<Integer> correctOutput = Arrays.asList(24, -8, 6, 10, 0, 72);
		List<Integer> output = AssignmentThree.doubling(input);
		assertTrue(correctOutput.equals(output));
	}
}
