package com.xworkz.companydb.CompanyUtil;

import java.sql.*;

public class ConnectionProvider {
	private static Connection connection;
	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Prathu@123");
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		} else {
			System.out.println("Connection not created");
			return connection;
		}

	}

}
