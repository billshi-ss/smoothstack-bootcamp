/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.Random;
import java.util.Scanner;

/**
 * Plays a guess game with the user
 * Week 1 day 1 (3/8/21) assignment
 * @author Bill Shi
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tries = 5;
		
		Random rand = new Random();
		int ans = 1 + rand.nextInt(100);
		
		Scanner in = new Scanner(System.in);
		int input;
		while (tries > 0) {
			System.out.print("Enter a guess: ");
			
			input = in.nextInt();
			
			if (input >= ans - 10 && input <= ans + 10) {
				System.out.printf("The answer is %d!\n", ans);
				break;
			} else if (tries > 1) {
				System.out.println("Try again");
			}
			
			tries--;
		}
		
		if (tries == 0) {
			System.out.printf("Sorry, the number was %d\n", ans);
		}
		
		in.close();
	}
	
}
