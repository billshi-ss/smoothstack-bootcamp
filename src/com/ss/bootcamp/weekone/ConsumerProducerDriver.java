/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.LinkedList;

/**
 * Driver class to execute my implementation of the consumer-producer
 * problem
 * Week one day four (3/11/21) assignment
 * @author Bill Shi
 *
 */
public class ConsumerProducerDriver {
	
	public static void main(String[] args) {
		
		LinkedList<String> buffer = new LinkedList<>();
		int capacity = 50;
		
		Consumer c0 = new Consumer(buffer);
		Consumer c1 = new Consumer(buffer);
		
		Producer p0 = new Producer(buffer, capacity, 100);
		Producer p1 = new Producer(buffer, capacity, 100);
		Producer p2 = new Producer(buffer, capacity, 100);
		Producer p3 = new Producer(buffer, capacity, 100);
		
		c0.start();
		c1.start();
		p0.start();
		p1.start();
		p2.start();
		p3.start();
		
	}
	
}
