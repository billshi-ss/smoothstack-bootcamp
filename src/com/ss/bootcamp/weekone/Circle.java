/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Circle class implementing the Shape interface
 * @author Bill Shi
 * week one day two (3/9/21) assignment
 *
 */
public class Circle implements Shape{
	
	double radius;

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//@Override
	public void display() {
		System.out.println("I am a circle! O");
	}
	
	

}
