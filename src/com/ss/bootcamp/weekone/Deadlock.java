/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Run two threads that will deadlock
 * Week one day four (3/11/21) assignment
 * @author Bill Shi
 *
 */
public class Deadlock {
	
	public static Object mutex1 = new Object();
	public static Object mutex2 = new Object();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				
				synchronized (mutex1) {					
					System.out.println("Thread 1: Holding mutex1");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {}
					System.out.println("Thread 1: Waiting on mutex 2");
					synchronized (mutex2) {
						System.out.println("Thread 2: Holding mutex1 and mutex2");
					}
				}
				
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				
				synchronized (mutex2) {					
					System.out.println("Thread 2: Holding mutex2");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {}
					System.out.println("Thread 2: Waiting on mutex 1");
					synchronized (mutex1) {
						System.out.println("Thread 2: Holding mutex1 and mutex2");
					}
				}
				
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
