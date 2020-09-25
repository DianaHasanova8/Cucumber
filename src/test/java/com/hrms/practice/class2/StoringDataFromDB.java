package com.hrms.practice.class2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.sql.ResultSetMetaData;

import org.junit.Test;

public class StoringDataFromDB {
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dUrl = "jdbc:mysql://18.232.148.34/syntaxhrm_mysql";

	@Test
	public void getAndStroreData() throws SQLException {

		Connection connect = DriverManager.getConnection(dUrl, dbUsername, dbPassword);
		Statement st = connect.createStatement();
		ResultSet resultSet = st.executeQuery("select id,name,county_code from ohrm_location");

		List<Map<String, String>> listData = new ArrayList();

		while (resultSet.next()) {
			Map<String, String> map = new LinkedHashMap<>();
			map.put("id", resultSet.getObject("id").toString());
			map.put("name", resultSet.getObject("name").toString());
			map.put("county_code", resultSet.getObject("county_code").toString());

			listData.add(map);
		}
		System.out.println(listData);
	}

	@Test
	public void getDataFromDB() throws SQLException {
		Connection connection = DriverManager.getConnection(dUrl, dbUsername, dbPassword);
		System.out.println("Connection was created");

		Statement st = connection.createStatement();
		ResultSet rsSet = st.executeQuery("select id,name,county_code from ohrm_location");

		ResultSetMetaData rsetMetaData = rsSet.getMetaData();

		List<Map<String, String>> listData = new ArrayList<>();

		Map<String, String> rowMap;

		while (rsSet.next()) {
			rowMap = new LinkedHashMap<>();
			for (int i = 1; i < rsetMetaData.getColumnCount(); i++) {
				rowMap.put(rsetMetaData.getColumnName(i), rsSet.getObject(i).toString());
				listData.add(rowMap);
			}

		}
	}
}
