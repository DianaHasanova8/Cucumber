package com.hrms.practice.class2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:type driver:host:port//name of the database
	String dUrl = "jdbc:mysql://18.232.148.34/syntaxhrm_mysql";

	@Test
	public void gettingConnected() throws SQLException {
		Connection con = DriverManager.getConnection(dUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData = con.getMetaData();
		String dbName = dbMetaData.getDatabaseProductName();
		System.out.println(dbName);

		Statement st = con.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_skills");

		ResultSetMetaData rsetMetaData = rset.getMetaData();
		int cols = rsetMetaData.getColumnCount();
		System.out.println(cols);
		String colsName;

		for (int i = 1; i <= cols; i++) {
			colsName = rsetMetaData.getCatalogName(i);
			System.out.println("Column name " + colsName);
		}

		String id;
		String skill;

		while (rset.next()) {
			id = rset.getObject("id").toString();
			skill = rset.getObject("name").toString();
			System.out.println(id + " " + skill);
		}
		con.close();
		st.close();
		rset.close();
	}
}
