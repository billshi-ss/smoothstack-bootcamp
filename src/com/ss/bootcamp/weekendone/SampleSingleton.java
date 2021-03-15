/**
 * 
 */
package com.ss.bootcamp.weekendone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Modified given to code to make SampleSingleton a correctly
 * implemented singleton class
 * Week one assignment, assignment 6
 * @author Bill Shi
 *
 */
public class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	private SampleSingleton() {
		super();
	}
	
	public static SampleSingleton getInstance() {
		if (instance == null) {
				synchronized (instance) {
				if (instance == null) {
					return new SampleSingleton();
				} else {
					return instance;
				}
			}
		}
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
		
		try {
			
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			BigDecimal x;
			while(rs.next()) {
				x = rs.getBigDecimal(1).multiply(input);
			}
			
		} catch (SQLException e) {
			System.exit(-1);
		}
		
	}
}

