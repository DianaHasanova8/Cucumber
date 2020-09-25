package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class JDBC_Demo2 {

	String userName = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:type driver:host:port/name of the DB
	String dbUrl = "jdbc:mysql://166.62.36.207/syntaxhrm_mysql";

	@Test
	public void getDataFromDB() throws SQLException {

		Connection connection = DriverManager.getConnection(dbUrl, userName, dbPassword);
		System.out.println("Connection is created");
		Statement st = connection.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_nationality");

		rset.next();
		String firstRowData = rset.getString("name");
		System.out.println(firstRowData);
        
		rset.next();
		String secondRowData = rset.getObject("name").toString();
		System.out.println("Second row data "+ secondRowData);

		String data;
		while (rset.next()) {
			data = rset.getObject("name").toString();
			System.out.println(data);
		}
		rset.close();
		st.close();
		connection.close();

	}

	@Test
	public void TaskSQL() throws SQLException {
		System.out.print("Using ArrayList" + " ");
		Connection connect2 = DriverManager.getConnection(dbUrl, userName, dbPassword);
		System.out.println("Connection is created");
		Statement st = connect2.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_job_title");
		ArrayList<String> arrData = new ArrayList<>();
		while (rset.next()) {
			arrData.add(rset.getString("job_title"));
		}
		System.out.println(arrData.toString());

//			for (String dataDB : arrData) {
//				System.out.println(dataDB);
//			}

		rset.close();
		st.close();
		connect2.close();

	}
}