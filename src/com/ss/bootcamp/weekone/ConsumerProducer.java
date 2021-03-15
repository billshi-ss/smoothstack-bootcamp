/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.ArrayList;
import java.util.List;

/**
 * WIP consumer producer problem
 * @author Bill Shi
 *
 */
public class ConsumerProducer {

	static volatile List<Integer> buffer = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Thread consumer = new Thread() {
			public void run() {
				boolean bufEmpty = false;
				
				while (true) {
					
					synchronized (buffer) {
						bufEmpty = !(buffer.size() > 0);
						if (!bufEmpty) {
							buffer.remove(0);
							System.out.printf("Consumed one integer, the buffer now has %d integers\n", buffer.size());
						}
						try {
							Thread.sleep(500);
						} catch (Exception e) {
						}
					}
					
					try {
						if (bufEmpty)
							Thread.sleep(500);
					} catch (Exception e) {
					}
					
				}
			}
		};
		
		Thread producer = new Thread() {
			public void run() {
				boolean bufFull = false;
				
				while (true) {
					
					synchronized (buffer) {
						bufFull = !(buffer.size() < 10);
						if (!bufFull) {
							buffer.add(0, 0);
							System.out.printf("Produced one integer, the buffer now has %d integers\n", buffer.size());
						}
						try {
							Thread.sleep(500);
						} catch (Exception e) {
						}
					}
					
					try {
						if (bufFull)
							Thread.sleep(2000);
					} catch (Exception e) {
					}
					
				}
			}
		};
		
		consumer.start();
		producer.start();
		
	}
	
}
