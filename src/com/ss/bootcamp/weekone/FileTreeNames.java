/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.io.File;

/**
 * Takes the path to a folder as a command line argument, and print the names
 * of folders and files that are descendants of the given folder
 * @author Bill Shi
 * week one day three (3/10/21) assignment
 */
public class FileTreeNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Please provide the path to a folder (one argument only)");
			System.exit(-1);
		}
		
		try {
			
			File root = new File(args[0]);
			
			if (root.isFile()) {
				System.out.println("The given path is a file, please provide the path to a folder");
				System.exit(-1);
			}
			
			FileTreeNames printAll = new FileTreeNames();
			printAll.exploreFileTree(root);
			
			
		} catch (NullPointerException e) {
			System.out.println("The file specified by the path is not found");
			System.exit(-1);
		}
		
	}
	
	/* recursively open directories and print the names of files and directories
	 * found */
	public void exploreFileTree(File current) {
		System.out.println(current.getName());
		if (current.isDirectory())
			for (File child : current.listFiles()) {
				exploreFileTree(child);
			}		
	}

}
