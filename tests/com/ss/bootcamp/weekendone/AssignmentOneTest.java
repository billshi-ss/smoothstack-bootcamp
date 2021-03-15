/**
 * 
 */
package com.ss.bootcamp.weekendone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for AssignmentOne.java
 * Week one assignment, assignment one
 * @author Bill Shi
 *
 */
public class AssignmentOneTest {

	AssignmentOne a1 = new AssignmentOne(); 
	
	@Test
	public void isOddTests() {
		assertTrue(a1.isOdd().performOn(1));
		assertTrue(a1.isOdd().performOn(7));
		assertFalse(a1.isOdd().performOn(2));
		assertFalse(a1.isOdd().performOn(78));
	}
	
	@Test
	public void isPrimeTests() {
		assertTrue(a1.isPrime().performOn(5));
		assertTrue(a1.isPrime().performOn(7));
		assertFalse(a1.isPrime().performOn(6));
		assertTrue(a1.isPrime().performOn(13));
		assertFalse(a1.isPrime().performOn(49));
	}
	
	@Test
	public void isPalindromeTests() {
		assertTrue(a1.isPalindrome().performOn(878));
		assertFalse(a1.isPalindrome().performOn(678));
		assertTrue(a1.isPalindrome().performOn(676));
		assertFalse(a1.isPalindrome().performOn(12345));
		assertTrue(a1.isPalindrome().performOn(445544));
	}
}
