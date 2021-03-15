/**
 * 
 */
package com.ss.bootcamp.weekone;

/**
 * Singleton class with double-checked locking
 * week one day four (3/11/21) assignment
 * @author Bill Shi
 *
 */
public class DoubleCheckedSingleton {

	static volatile DoubleCheckedSingleton instance;
	
	private DoubleCheckedSingleton() {
		super();
	}
	
	public static DoubleCheckedSingleton DoubleCheckedSingleton() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
					return instance;
				} else {
					return instance;
				}
			}
		} else {
			return instance;
		}
	}
	
}
