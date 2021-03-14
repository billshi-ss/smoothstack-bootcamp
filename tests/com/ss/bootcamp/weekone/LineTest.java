/**
 * 
 */
package com.ss.bootcamp.weekone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * WIP unit test assignment
 * @author Bill Shi
 *
 */
public class LineTest {
	
	private Line line1 = new Line(0,0,10,10);
	private Line line2 = new Line(5,0,0,-5);
	private Line line3 = new Line(1,0,4,4);
	
	@Test
	public void slopeTest1() {
		assertEquals(1, line1.getSlope(), 0.0001);
	}
	
	@Test
	public void slopeTest2() {
		assertEquals(1, line2.getSlope(), 0.0001);
	}
	
	@Test
	public void slopeTest3() {
		assertEquals(1.3333, line3.getSlope(), 0.0001);
	}
	
	@Test
	public void distanceTest1() {
		assertEquals(14.1421, line1.getDistance(), 0.0001);
	}
	
	@Test
	public void distanceTest2() {
		assertEquals(7.071, line2.getDistance(), 0.0001);
	}
	
	@Test
	public void distanceTest3() {
		assertEquals(5, line3.getDistance(), 0.0001);
	}
	
	@Test
	public void parallelTest() {
		assertTrue(line1.parallelTo(line2));
	}
	
	@Test
	public void notParallelTest() {
		assertFalse(line1.parallelTo(line3));
	}
}
