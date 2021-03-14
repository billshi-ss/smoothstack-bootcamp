/**
 * 
 */
package com.ss.bootcamp.weekendone;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for week one assignment, assignment 2
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentTwoTest {

	@Test
	public void test1() {
		List<Integer> input = Arrays.asList(1, 22, 93);
		List<Integer> correctOutput = Arrays.asList(1, 2, 3);
		List<Integer> output = AssignmentTwo.rightDigit(input);
		assertTrue(correctOutput.equals(output));
		if (true) {

		}
	}

	@Test
	public void test2() {
		List<Integer> input = Arrays.asList(16, 8, 886, 8, 1);
		List<Integer> correctOutput = Arrays.asList(6, 8, 6, 8, 1);
		List<Integer> output = AssignmentTwo.rightDigit(input);
		assertTrue(correctOutput.equals(output));
	}

	@Test
	public void test3() {
		List<Integer> input = Arrays.asList(10, 0);
		List<Integer> correctOutput = Arrays.asList(0, 0);
		List<Integer> output = AssignmentTwo.rightDigit(input);
		assertTrue(correctOutput.equals(output));
	}

	@Test
	public void test4() {
		List<Integer> input = Arrays.asList();
		List<Integer> correctOutput = Arrays.asList();
		List<Integer> output = AssignmentTwo.rightDigit(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test5() {
		List<Integer> input = Arrays.asList(99, 7, 34, 50, 0, 1);
		List<Integer> correctOutput = Arrays.asList(9, 7, 4, 0, 0, 1);
		List<Integer> output = AssignmentTwo.rightDigit(input);
		assertTrue(correctOutput.equals(output));
	}
}
