/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Appends text to the end of a file
 * @author Bill Shi
 * week one day three (3/10/21) assignment
 *
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String path = "resource\\out\\Append2Me.txt";
		
		try (FileWriter fw = new FileWriter(path, true)) {
			
			fw.write("I am a line of characters!\n");	
			
		} catch (IOException e) {
			System.out.println("Cannot open or create the file specified by the path");
			System.exit(-1);
		}
		
		System.out.println("Successfully appended to file");
		
	}

}
