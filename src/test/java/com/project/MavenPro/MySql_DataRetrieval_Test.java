package com.project.MavenPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MySql_DataRetrieval_Test {

	@Test
	public void MySqlDBTest() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/caloriedb","root","root");
		Statement stmt = con.createStatement(); //to executeQuery
		ResultSet result = stmt.executeQuery("select * from calorietab");
		while(result.next()){
			System.out.println(result.getString(1) + " " + result.getString(2));
		}
		
	}
}
