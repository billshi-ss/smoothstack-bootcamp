/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Search file specified by path given as an command line argument,
 * print the number of 'e' character found in the file
 * @author Bill Shi
 * week one day three (3/10/21) assignment
 * 
 */
public class CharacterSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Please provide the path to a text file (one argument only)");
			System.exit(-1);
		}
		
		try (FileReader reader = new FileReader(args[0])) {
			
			int eCount = 0;
			int c;
			while ((c = reader.read()) != -1)
				if ((char) c == 'e')
					eCount++;
			
			System.out.printf("Successfully searched file and found %d e's\n", eCount);
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the file specified by path");
			
		} catch (IOException e) {
			System.out.println("Encountered an IO error. Does the path specify a folder?");
		}
		
	}

}
