/**
 * 
 */
package com.ss.bootcamp.weekendone;

import java.util.Scanner;

/**
 * Week one assignment, assignment one
 * @author Bill Shi
 *
 */
public class AssignmentOne {

	public static void main(String[] args) {
		AssignmentOne a1 = new AssignmentOne();
		
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int numLines = Integer.parseInt(input);
		String[] ops = new String[numLines];
		
		for (int i = 0; i < numLines; i++)
			ops[i] = in.nextLine();

		for (String op : ops) {
						
			int opCode = Integer.parseInt(op.split(" ")[0]);
			int num = Integer.parseInt(op.split(" ")[1]);
			
			switch (opCode) {
			case 1: {
				boolean ret = a1.isOdd().performOn(num);
				System.out.println(ret ? "ODD" : "EVEN");
				break;
			}
			case 3: {
				boolean ret = a1.isPalindrome().performOn(num);
				System.out.println(ret ? "PALINDRIME" : "NOT PALINDROME");
				break;
			}
			case 2: {
				boolean ret = a1.isPrime().performOn(num);
				System.out.println(ret ? "PRIME" : "COMPOSITE");
				break;
			}
			}
			
		}

		in.close();
	}

	public PerformOperation isOdd() {
		return new PerformOperation() {
			public boolean performOn(int i) {
				return i % 2 == 1;
			}
		};
	}

	public PerformOperation isPrime() {
		return num -> {
			for (int i = 2; i < num - 1; i++) {
				if (num % i == 0)
					return false;
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return num -> {
			String numString = Integer.toString(num);
			int i = 0;
			int j = numString.length() - 1;
			while (i < j) {
				if (numString.charAt(i) != numString.charAt(j))
					return false;
				i++;
				j--;
			}
			return true;
		};
	}

}
