/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * WIP
 * @author Bill Shi
 *
 */
public class Deadlock {
	
	static String signal1 = "Stop";
	static String signal2 = "Stop";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* each thread reads in one word */
		/* each thread wants to print the word it read in appended to the word the other thread read in */
				
		Thread goSignal1 = new Thread() {
			public void run() {
				
				synchronized (signal2) {
					
					signal1 = "Go";
					
					try {
						while (signal2.equals("Stop")) {
							Thread.sleep(1000);
							System.out.println("Waiting on signal 2");
						}
					} catch (InterruptedException e) {
					}
					
					System.out.println("Go go!");
				}
				
			}
		};
		
		Thread goSignal2 = new Thread() {
			public void run() {
				
				synchronized (signal1) {
					
					signal2 = "Go";
					
					try {
						while (signal1.equals("Stop")) {
							Thread.sleep(1000);
							System.out.println("Waiting on signal 1");
						}
					} catch (InterruptedException e) {
					}
					
					System.out.println("Go go!");
				}
				
			}
		};
		
		goSignal1.start();
		goSignal2.start();
	}

}
