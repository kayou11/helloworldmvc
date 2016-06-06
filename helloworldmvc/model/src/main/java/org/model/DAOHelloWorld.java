package org.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class DAOHelloWorld{
	
	private static String URL = "jdbc:mysql://localhost:3306/helloWorld";
	private static String LOGIN = "root";
	private static String PASSWORD = "root";
	private Connection connection;
	private Statement statement;
	
	public DAOHelloWorld() {
		this.connection = null;
		this.statement = null;
	}
	

	 public Boolean open() {
		 
	        try {
	              Class.forName("com.mysql.jdbc.Driver");
	              this.connection = DriverManager.getConnection(DAOHelloWorld.URL, DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
	               this.statement = this.connection.createStatement();
	        	} catch (final ClassNotFoundException e) {
	        		e.printStackTrace();
	        		return false;
	        	} catch (final SQLException e) {
	        		e.printStackTrace();
	        		return false;
	        	}
	        return true;
	}
	
	public void close(){

	}
	
	public static String getQuerySelectFirstHelloWorld() { 
		return "SELECT * FROM `HelloWorld` WHERE `ID_helloWorld` = " + 1; 
	}

	private ResultSet executeQuery(String query) throws SQLException{
		
		return this.statement.executeQuery(query);
		
	}

}

	
