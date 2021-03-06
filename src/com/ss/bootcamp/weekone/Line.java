/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Line class that unit tests in LineTest.java will test
 * @author Bill Shi
 * week one day four (3/12/21) assignment
 *
 */
public class Line {
	
	private double x0, y0, x1, y1;

	/**
	 * construct a line object
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 */
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}

	/**
	 * calculate the slope of the line
	 */
	public double getSlope() {
		/* avoid dividing by zero */
		if (x1 == x0)
			throw new ArithmeticException();
		
		return (y1 - y0)/(x1 - x0);
	}
	
	/**
	 * calculate the distance of the line
	 */
	public double getDistance() {
		return Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	}
	
	/**
	 * return whether a line is parallel to another
	 */
	public boolean parallelTo(Line l) {
		if (Math.abs(getSlope() - l.getSlope()) < .0001) {
			return true;
		} else {
			return false;
		}
	}
}
