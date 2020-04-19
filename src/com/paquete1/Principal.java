package com.paquete1;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.Queryators.OracleQueryator;
import com.Queryators.Queryator;

class Principal {
	
	private static final String CONNECTIONSTRING = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String USER = "SYS as sysdba";
	private static final String PASSWORD = "12345";
	private static final String QUERY = "SELECT * FROM COLEGIOS";
	
	public static void main (String args []) {
		tryOutOracle();
	}
	
	private static void tryOutOracle () {
		Queryator queryator = new OracleQueryator (CONNECTIONSTRING, USER, PASSWORD);
		ResultSet result = queryator.executeQuery(QUERY);
		printResultSet (result);
	}
	
	private static void printResultSet (ResultSet result) {
		try {
			while(result.next()) {
				System.out.print(String.valueOf(result.getInt(1)) + " " + result.getString(2));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void tryOutMySql () {
//		Queryator queryator = new MySQLQueryator (CONNECTIONSTRING, USER, PASSWORD);
//		ResultSet result = queryator.executeQuery("SELECT * FROM COLEGIOS");
//		try {
//			while(result.next()) {
//				System.out.print(String.valueOf(result.getInt(1)) + " ");
//				System.out.print(result.getString(2));
//				System.out.println();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}
