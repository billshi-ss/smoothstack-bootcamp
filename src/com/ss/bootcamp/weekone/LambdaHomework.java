/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Implements lambda methods for week one day five (3/12/21)'s
 * assignment
 * @author Bill Shi
 *
 */
public class LambdaHomework {	
	
	/**
	 * order the given list of string from shortest to longest
	 * length
	 * @param list
	 */
	public static void shortestFirst(List<String> list) {
		list.sort((s1, s2) -> s1.length() - s2.length());
	}
	
	/**
	 * order the given list of string from longest to shortest
	 * length
	 * @param list
	 */
	public static void longestFirst(List<String> list) {
		list.sort((s1, s2) -> s2.length() - s1.length());
	}
	
	/**
	 * order strings alphabetically by their first letter
	 * @param list
	 */
	public static void orderByFirstLetter(List<String> list) {
		list.sort((s1, s2) -> s1.substring(0,1).toLowerCase().compareTo(
							  s2.substring(0,1).toLowerCase()));
	}
	
	/**
	 * order the list so that words that starts with 'e' are at
	 * the beginning of the list
	 * @param list
	 */
	public static void eWordsFirst1(List<String> list) {
		list.sort((s1, s2) -> (s2.charAt(0) == 'e' ? 1 : 0) - (s1.charAt(0) == 'e' ? 1 : 0));
	}
	
	/**
	 * order the list so that words that starts with 'e' are at
	 * the beginning of the list
	 * @param list
	 */
	public static void eWordsFirst2(String[] list) {
		Arrays.sort(list, (s1, s2) -> LambdaHomework.eWordsFirst2Helper(s1, s2));
	}
	
	/**
	 * determine if s1's order is before, the same, or after s2
	 * @param s1
	 * @param s2
	 * @return int
	 */
	public static int eWordsFirst2Helper(String s1, String s2) {
		if (s1.charAt(0) == 'e') {
			if (s2.charAt(0) == 'e') {
				return 0;
			} else {
				return -1;
			}
		} else {
			if (s2.charAt(0) == 'e') {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	/**
	 * take a list of num and return a string containing a 
	 * comma separated string of integers with their parity labeled
	 * by a prepended 'e' or 'o'
	 * @param nums
	 * @return String
	 */
	public static String labelIntegerList(List<Integer> nums) {		
		List<String> strs = nums.stream()
								.map(i -> i % 2 == 0 ? "e" + i : "o" + i)
				  			    .collect(toList());
		return String.join(",", strs);		
	}
	
	/**
	 * take a list of strings and return a list containing only words
	 * that are three character long and starts with 'a'
	 * @param words
	 * @return
	 */
	public static List<String> threeLetterAWords(List<String> words) {
		return words.stream()
					.filter(s -> (s.length() == 3) && (s.charAt(0) == 'a'))
					.collect(toList());
	}
	
}
