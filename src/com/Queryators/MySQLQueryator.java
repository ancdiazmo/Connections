package com.Queryators;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

//MySQL
//"jdbc:mysql://HOSTNAME:PORT/database?useSSL=false";

public class MySQLQueryator implements Queryator {
	
	private Connection sqlConnection;
	
	public MySQLQueryator (String connectionString, String user, String password) {
		createConnection(connectionString, user, password);
	}
	
	private void createConnection(String connectionString, String user, String password) {
		try {
			DriverManager.registerDriver(new Driver());
			sqlConnection = DriverManager.getConnection(connectionString, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery (String query) {
//			try {
//				PreparedStatement statement = oracleConnection.prepareStatement(query);
//				ResultSet result = statement.executeQuery();
//				return result;
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
		return null;
	}	
}

