package com.nastation.c15;

//: c15:jdbc:Lookup.java
//Looks up email addresses in a
//local database using JDBC.
import java.sql.*;

public class Lookup {
	
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		
		String dbUrl = "jdbc:mysql://localhost/test";
		String user = "root";
		String password = "123456";
		
		// Load the driver (registers itself)
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(dbUrl, user, password);
		Statement s = c.createStatement();
		// SQL code:
		ResultSet r = s.executeQuery("SELECT FIRST, LAST, EMAIL "
				+ "FROM people  " + "WHERE " + "(LAST='" + args[0]
				+ "') " + " AND (EMAIL Is Not Null) " + "ORDER BY FIRST");
		while (r.next()) {
			// Capitalization doesn't matter:
			System.out.println(r.getString("LAST") + ", "
					+ r.getString("FIRST") + ": " + r.getString("EMAIL"));
		}
		s.close(); // Also closes ResultSet
	}
}