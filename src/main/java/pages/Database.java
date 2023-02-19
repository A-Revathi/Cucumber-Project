package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;
	
	public String getDataFromDB(String columnName) {
		
		try {
		    //set properties for mySQL
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			String sqlUserName= "root";
			String sqlPassword= "root";
			String sqlUrl= "jdbc:mysql://localhost:3306/june2022";
			String sqlQuery= "Select * from users";
			
			//create connection to the local database
			connection = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassword);
			
			
			//Empowering connection reference variable to execute queries
			statement = connection.createStatement();
			
			
			//Delivering query
			resultSet = statement.executeQuery(sqlQuery);
			
				while(resultSet.next()) {
				    columnValue = resultSet.getString(columnName);
					return columnValue;
				}
		}	
		 catch(Exception e) {
			 e.printStackTrace();
		 } 
		
		 finally {
			 
			 try {
				 
				 if(resultSet!=null) {
					 resultSet.close();
				 }
				 if(connection != null) {
					 connection.close();
					}
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		 }
		 
		
		return columnValue;
	}
	
}
