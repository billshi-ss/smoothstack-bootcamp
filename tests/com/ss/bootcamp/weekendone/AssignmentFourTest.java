/**
 * 
 */
package com.ss.bootcamp.weekendone;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for week one assignment, assignment 4
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentFourTest {

	@Test
	public void test1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		List<String> output = AssignmentFour.noX(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test2() {
		List<String> input = Arrays.asList("ax", "bb", "cx");
		List<String> correctOutput = Arrays.asList("a", "bb", "c");
		List<String> output = AssignmentFour.noX(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test3() {
		List<String> input = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> correctOutput = Arrays.asList("a", "bb", "c");
		List<String> output = AssignmentFour.noX(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test4() {
		List<String> input = Arrays.asList("x");
		List<String> correctOutput = Arrays.asList("");
		List<String> output = AssignmentFour.noX(input);
		assertTrue(correctOutput.equals(output));
	}
	
	@Test
	public void test5() {
		List<String> input = Arrays.asList("xxdx","xxx","art");
		List<String> correctOutput = Arrays.asList("d","","art");
		List<String> output = AssignmentFour.noX(input);
		assertTrue(correctOutput.equals(output));
	}
}
