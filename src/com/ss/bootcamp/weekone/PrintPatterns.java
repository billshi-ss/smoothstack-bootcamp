/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Prints four patterns
 * @author Bill Shi
 *
 */
public class PrintPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String star = "*";
		String dash = "-";
		String space = " ";

		/* prints the first pattern */
		System.out.println("1)");
		for (int i = 1; i <= 4; i++) {
			System.out.println(star.repeat(i));
		}
		System.out.println(dash.repeat(9));
		
		/* prints the second pattern */
		System.out.println("2)");
		System.out.println(dash.repeat(10));
		for (int i = 4; i >= 1; i--) {
			System.out.println(star.repeat(i));
		}
		
		int numStar;								/* numStar is the number of stars printed for a line */
		
		/* prints the third pattern */
		System.out.println("3)");
		for (int i = 5; i >= 2; i--) {				/* i is the number of spaces printed for a line */
			System.out.print(space.repeat(i));
			numStar = 1+2*(5-i);
			System.out.println(star.repeat(numStar));
		}
		System.out.println(dash.repeat(11));
		
		/* prints the fourth pattern */
		System.out.println("4)");
		System.out.println(dash.repeat(12));
		for (int i = 2; i <= 5; i++) {				/* i is the number of spaces printed for a line */
			System.out.print(space.repeat(i));
			numStar = 1+2*(5-i);
			System.out.println(star.repeat(numStar));
		}
	}

}
