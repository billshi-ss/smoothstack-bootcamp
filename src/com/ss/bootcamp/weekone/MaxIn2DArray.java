/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Print the largest number in a 2D array and its coordinates
 * @author Bill Shi
 * week one day two (3/9/21) assignment
 *
 */
public class MaxIn2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] matrix = {{23, 54, 34, 78, 65},
						  {67, 16, 13, 57, 19},
						  {12, 45, 67, 12 ,19},
						  {91, 64, 23, 78, 34},
						  {34, 86, 54, 72, 43}};
		
		int max = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] >= max) {
					max = matrix[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		System.out.printf("The largest number in the 2D array is %d. It is located at row %d and col %d", max, row, col);
	}

}
