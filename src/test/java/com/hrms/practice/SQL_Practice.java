package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.junit.Test;

public class SQL_Practice {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dUrl = "jdbc:mysql://18.232.148.34/syntaxhrm_mysql";

	@Test
	public void review() {
		try {
			Connection c = DriverManager.getConnection(dUrl, dbUsername, dbPassword);
			Statement st = c.createStatement();
			String sqlQuery =  "select e.emp_firstname, e.emp_lastname, el.name as language" + 
					"from hs_hr_employees e join hs_hr_emp_language l" + 
					"on e.emp_number = l.emp_number" + 
					"join ohrm_language el" + 
					"on el.id = l.lang_id;";

			ResultSet rS = st.executeQuery(sqlQuery);

			ResultSetMetaData rsetMData = rS.getMetaData();
			int cols = rsetMData.getColumnCount();

			String value;
			List<Map<String, Object>> map = new ArrayList<>();

			while (rS.next()) {
				Map<String, Object> mapValue = new LinkedHashMap<>();
                
				for (int i = 1; i <= cols; i++) {
                 mapValue.put(rsetMData.getColumnName(i), rS.getObject(i).toString());
				}
				map.add(mapValue);
//				value = rS.getString("emp_firstname").toString();
//				System.out.println(value);

			}

			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
