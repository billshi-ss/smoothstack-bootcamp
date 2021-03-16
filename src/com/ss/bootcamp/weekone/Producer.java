/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.LinkedList;

/**
 * Producer class used in ConcumerProducerDriver.java
 * Week one day four (3/11/21) assignment
 * @author Bill Shi
 *
 */
public class Producer extends Thread {

	static int producerSerialNumber = 0;

	int sn;
	int dataSerialNumber;
	int numToProduce;
	final int capacity;
	// Should I put a volatile key word here?
	LinkedList<String> sharedResource;

	/**
	 * 
	 */
	public Producer(LinkedList<String> sharedResource, int capacity, int numToProduce) {
		sn = producerSerialNumber;
		producerSerialNumber++;
		dataSerialNumber = 0;
		this.sharedResource = sharedResource;
		this.capacity = capacity;
		this.numToProduce = numToProduce;
	}

	private boolean isFull() {
		int currentSize = sharedResource.size();
		if (currentSize >= capacity) {
			if (currentSize > capacity) {
				System.out.printf("Buffer is over capacity, size: %d\n", currentSize);
			}
			return true;
		}
		return false;
	}

	public void run() {
		
		while (dataSerialNumber < numToProduce) {

			if (!isFull()) {
				synchronized (sharedResource) {
					if (!isFull()) {
						String newData = String.format("c%d-%d", sn, dataSerialNumber);
						dataSerialNumber++;
						sharedResource.add(newData);
						System.out.printf("(Producer %d) produced %s\n", sn, newData);
					} else {
						System.out.printf("(Producer %d) tried to add to a full buffer !!\n", sn);
					}
				}
			} else {
				try {
					Thread.sleep(100);
					System.out.printf("(Producer %d) waited on a full buffer\n", sn);
				} catch (InterruptedException e) {};
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {};
			
		}
		
	}
}
