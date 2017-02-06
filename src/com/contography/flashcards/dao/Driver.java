/**
 * Project : com.contography.flashcards 
 * File : Driver.java
 * Date : Feb 5, 2017
 * Time : 2:11:29 PM
 */
package com.contography.flashcards.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jackie
 *
 */
public class Driver {
	
	private Connection _connection;
	
	public Driver(){
		connect();
	}
	
	public void connect(){
		String url = "jdbc:mysql://localhost:3306/flashcards?autoReconnect=true&useSSL=false";
		String user = "guest";
		String password= "password";
		
		try{
			_connection = DriverManager.getConnection(url, user, password);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public boolean createTable(String createQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		return statement.execute(createQuery);
	}
	
	public int insertData(String insertQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		return statement.executeUpdate(insertQuery);
	}	
	
	public ResultSet getData(String selectQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(selectQuery);
		return resultSet;
	}	
	
	public boolean dropTable(String dropQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		return statement.execute(dropQuery);
	}
	
	public void shutDown() throws SQLException{
		Statement statement = _connection.createStatement();
		statement.close();
	}
	
	public boolean tableExists(String tableName) throws SQLException{
		
		DatabaseMetaData databaseMetaData = _connection.getMetaData();
		ResultSet resultSet = databaseMetaData.getTables(_connection.getCatalog(), "%", "%", null);
		String name = null;
		while (resultSet.next()) {
			name = resultSet.getString("TABLE_NAME");
			if (name.equalsIgnoreCase(tableName)) {
				return true;
			}
		}
		return false; 
	}
	
	public int updateData(String insertQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		return statement.executeUpdate(insertQuery);
	}
	
	public int deleteData(String insertQuery) throws SQLException{
		Statement statement = _connection.createStatement();
		return statement.executeUpdate(insertQuery);
	}
	
}
