/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.Scanner;

/**
 * Read in multiple numbers (positive, negative, decimals, integers) and
 * output the sum
 * @author Bill Shi
 * week one day two (3/9/21) assignment
 *
 */
public class InputSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		double sum = 0;
				
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.print("New number or \"Stop\": ");
			
			/* takes input until "Stop" is read in */
			while (in.hasNext()) {
				
				if (in.hasNextInt()) {
					sum += in.nextInt();
					
				} else if (in.hasNextDouble()) {
					sum += in.nextDouble();
					
				} else {
					
					if ("Stop".equals(in.next())) {
						System.out.printf("The sum is %f\n", sum);
						break;
						
					} else {
						throw new Exception();
					}
					
				}
				
				System.out.print("New number or \"Stop\": ");	
			}
			
		} catch (Exception e) {
			System.out.println("Sorry, that's a illegal input");
		}
	}

}
