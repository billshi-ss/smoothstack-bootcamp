/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Rectangle class implementing the Shape interface
 * @author Bill Shi
 * week one day two (3/9/21) assignment
 *
 */
public class Rectangle implements Shape {

	double length, width;
	
	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//@Override
	public double calculateArea() {
		return length * width;
	}

	//@Override
	public void display() {
		System.out.println("I am a rectangle!");
	}

}
