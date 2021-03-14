/**
 * 
 */
package com.ss.bootcamp.weekone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for methods in LambdaHomework.java
 * Week one day five (3/12/21) assignment
 * @author Bill Shi
 *
 */
public class LambdaHomeworkTest {

	@Test
	public void shortestFirstTest1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		LambdaHomework.shortestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void shortestFirstTest2() {
		List<String> input = Arrays.asList("dddd","ccc","bb","a");
		List<String> correctOutput = Arrays.asList("a","bb","ccc","dddd");
		LambdaHomework.shortestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void shortestFirstTest3() {
		List<String> input = Arrays.asList("cereal","crazy","words","a");
		List<String> correctOutput = Arrays.asList("a","crazy","words","cereal");
		LambdaHomework.shortestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void shortestFirstTest4() {
		List<String> input = Arrays.asList("hello","","good","explosion");
		List<String> correctOutput = Arrays.asList("","good","hello","explosion");
		LambdaHomework.shortestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void shortestFirstTest5() {
		List<String> input = Arrays.asList("app","are","xerox","pencil","art","york");
		List<String> correctOutput = Arrays.asList("app","are","art","york","xerox","pencil");
		LambdaHomework.shortestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void longestFirstTest1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		LambdaHomework.longestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void longestFirstTest2() {
		List<String> input = Arrays.asList("a","bb","ccc","dddd");
		List<String> correctOutput = Arrays.asList("dddd","ccc","bb","a");
		LambdaHomework.longestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void longestFirstTest3() {
		List<String> input = Arrays.asList("a","crazy","words","cereal");
		List<String> correctOutput = Arrays.asList("cereal","crazy","words","a");
		LambdaHomework.longestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void longestFirstTest4() {
		List<String> input = Arrays.asList("hello","","good","explosion");
		List<String> correctOutput = Arrays.asList("explosion","hello","good","");
		LambdaHomework.longestFirst(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void orderByFirstLetterTest1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		LambdaHomework.orderByFirstLetter(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void orderByFirstLetterTest2() {
		List<String> input = Arrays.asList("e","d","c","b","a");
		List<String> correctOutput = Arrays.asList("a","b","c","d","e");
		LambdaHomework.orderByFirstLetter(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void orderByFirstLetterTest3() {
		List<String> input = Arrays.asList("apple","elon","dinosaur","eat");
		List<String> correctOutput = Arrays.asList("apple","dinosaur","elon","eat");
		LambdaHomework.orderByFirstLetter(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void eWordsFirst1Test1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		LambdaHomework.eWordsFirst1(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void eWordsFirst1Test2() {
		List<String> input = Arrays.asList("apple","elon","dinosaur","eat");
		List<String> correctOutput = Arrays.asList("elon","eat","apple","dinosaur");
		LambdaHomework.eWordsFirst1(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void eWordsFirst1Test3() {
		List<String> input = Arrays.asList("art","egress","butter","table","eagle");
		List<String> correctOutput = Arrays.asList("egress","eagle","art","butter","table");
		LambdaHomework.eWordsFirst1(input);
		assertTrue(correctOutput.equals(input));
	}
	
	@Test
	public void eWordsFirst2Test1() {
		String[] input = new String[0];
		String[] correctOutput = new String[0];
		LambdaHomework.eWordsFirst2(input);
		assertTrue(Arrays.equals(input, correctOutput));
	}
	
	@Test
	public void eWordsFirst2Test2() {
		String[] input = {"apple","elon","dinosaur","eat"};
		String[] correctOutput = {"elon","eat","apple","dinosaur"};
		LambdaHomework.eWordsFirst2(input);
		assertTrue(Arrays.equals(input, correctOutput));
	}
	
	@Test
	public void eWordsFirst2Test3() {
		String[] input = {"art","egress","butter","table","eagle"};
		String[] correctOutput = {"egress","eagle","art","butter","table"};
		LambdaHomework.eWordsFirst2(input);
		assertTrue(Arrays.equals(input, correctOutput));
	}
	
	@Test
	public void labelIntegerListTest1() {
		List<Integer> input = Arrays.asList();
		String expectedString = "";
		assertEquals(expectedString, LambdaHomework.labelIntegerList(input));
	}
	
	@Test
	public void labelIntegerListTest2() {
		List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
		String expectedString = "o1,e2,o3,e4,o5,e6,o7,e8,o9";
		assertEquals(expectedString, LambdaHomework.labelIntegerList(input));
	}
	
	@Test
	public void labelIntegerListTest3() {
		List<Integer> input = Arrays.asList(23,56,45,5,34,7);
		String expectedString = "o23,e56,o45,o5,e34,o7";
		assertEquals(expectedString, LambdaHomework.labelIntegerList(input));
	}
	
	@Test
	public void threeLetterAWordsTest1() {
		List<String> input = Arrays.asList();
		List<String> correctOutput = Arrays.asList();
		List<String> output = LambdaHomework.threeLetterAWords(input);
		assertTrue(correctOutput.equals(output));	
	}
	
	@Test
	public void threeLetterAWordsTest2() {
		List<String> input = Arrays.asList("app","are","xerox","pencil","art","york");
		List<String> correctOutput = Arrays.asList("app","are","art");
		List<String> output = LambdaHomework.threeLetterAWords(input);
		assertTrue(correctOutput.equals(output));	
	}
	
	@Test
	public void threeLetterAWordsTest3() {
		List<String> input = Arrays.asList("article", "area", "numb", "orange");
		List<String> correctOutput = Arrays.asList();
		List<String> output = LambdaHomework.threeLetterAWords(input);
		assertTrue(correctOutput.equals(output));	
	}
}
