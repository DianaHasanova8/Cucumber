package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
import org.junit.Test;

public class JDBC_Task {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dUrl = "jdbc:mysql://18.232.148.34/syntaxhrm_mysql";

	@Test
	public void getDataFromDB() throws SQLException {
		Connection connection = DriverManager.getConnection(dUrl, dbUsername, dbPassword);
		System.out.println("Connection was created");
		
		
		Statement st = connection.createStatement();
		ResultSet result = st.executeQuery("select job_title from ohrm_job_title");
		
		String data;
		ArrayList<String > dataArrayList= new ArrayList<>();
		while(result.next()) {
			data= result.getObject("job_title").toString();
			dataArrayList.add(data);
			
		}
		System.out.print(dataArrayList);
		
		
		// for loop
		// for(String data:dataArrayList){
		
		result.close();
		connection.close();
		st.close();
			
	}
}
