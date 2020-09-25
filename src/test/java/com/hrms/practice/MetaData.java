package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dUrl = "jdbc:mysql://18.232.148.34/syntaxhrm_mysql";

	@Test
	public void getMataData() throws SQLException {
		Connection connection = DriverManager.getConnection(dUrl, dbUsername, dbPassword);

		DatabaseMetaData dbData = connection.getMetaData();
		String dbName = dbData.getDatabaseProductName();
		String dbVersion = dbData.getDatabaseProductVersion();
		
		System.out.println(dbName);
		System.out.println(dbVersion);
		
		Statement st = connection.createStatement();
		ResultSet rset = st.executeQuery("select * from hs_hr_employees where emp_number=4353");
		 
		ResultSetMetaData resultData=rset.getMetaData();
		
		int cols= resultData.getColumnCount();
		System.out.println(cols);
		
		String  colName= resultData.getColumnName(1);
		System.out.println(colName);
		
		for(int i =1;i<=cols; i++) {
			String columnNames= resultData.getColumnName(i);
			System.out.println(columnNames);
		}
	}
}
