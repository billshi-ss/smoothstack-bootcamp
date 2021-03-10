/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Triangle class implementing the Shape interface
 * @author Bill-Smoothstack
 * week one day two (3/9/21) assignment
 *
 */
public class Triangle implements Shape {

	double base, height;
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	//@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	//@Override
	public void display() {
		System.out.println("I am a triangle!");
	}

}
