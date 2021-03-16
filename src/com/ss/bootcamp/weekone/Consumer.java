/**
 * 
 */
package com.ss.bootcamp.weekone;

import java.util.LinkedList;

/**
 * Consumer class used in ConcumerProducerDriver.java
 * Week one day four (3/11/21) assignment
 * @author Bill Shi
 *
 */
public class Consumer extends Thread {

	static int consumerSerialNumber = 0;

	int sn;
	// Should I put a volatile key word here?
	LinkedList<String> sharedResource;

	public Consumer(LinkedList<String> sharedResource) {
		sn = consumerSerialNumber;
		consumerSerialNumber++;
		this.sharedResource = sharedResource;
	}

	public void run() {

		while (true) {

			if (!sharedResource.isEmpty()) {
				synchronized (sharedResource) {
					if (!sharedResource.isEmpty()) {
						System.out.printf("Consumer %d consumed %s\n", sn, sharedResource.removeFirst());
					} else {
						System.out.printf("Consumer %d tried to remove from an empty buffer !!\n", sn);
					}
				}
			} else {
				try {
					Thread.sleep(100);
					System.out.printf("Consumer %d waited on an empty buffer\n", sn);
				} catch (InterruptedException e) {};
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {};

		}

	}

}
