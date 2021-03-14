/**
 * 
 */
package com.ss.bootcamp.weekendone;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Week one assignment, assignment 4
 * @author Bill Shi
 * 3/14/21
 *
 */
public class AssignmentFour {

	/**
	 * Take a list of strings and return a list of strings where
	 * the given strings had all occurrences of the character 'x' removed
	 * @param strs
	 * @return List<String>
	 */
	public static List<String> noX(List<String> strs) {
		return strs.stream()
				   .map(s -> s.replace("x", ""))
				   .collect(toList());
	}
	
}
