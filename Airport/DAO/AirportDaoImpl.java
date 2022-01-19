package com.xworkz.Airport.DAO;
import java.sql.*;

public class AirportDaoImpl implements AirportDaoInterface {
	static String url="jdbc:mysql://localhost:3306/airport";
	static String username="root";
	static String password="Prathu@123";
	@Override
	public void InsertEntity() {
		String insert1="INSERT INTO airport_details VALUES (5,'delhi','del','pnq',8,'delhi',false)";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insert1);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}
	}

	@Override
	public void UpdateEntity() {
		String update="UPDATE airport_details set location='new delhi' where aid=5";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			statement.executeUpdate(update);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}
	}

	@Override
	public void DeleteEntity() {
		String delete="DELETE FROM airport_details WHERE aid=5";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			statement.executeUpdate(delete);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}
		
	}

	@Override
	public void ReadEntity() {
		String select="SELECT * FROM airport_details WHERE aid=1;";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("aid"));//aid
				System.out.println(resultSet.getString("aname"));//aname
				System.out.println(resultSet.getString("asource"));//asource
				System.out.println(resultSet.getString("destination"));//destination
				System.out.println(resultSet.getInt("noOfTerminals"));//noOfTerminals
				System.out.println(resultSet.getString("location"));//location
				System.out.println(resultSet.getBoolean("isInterntional"));//isInterntional
				
			}
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}	
		
	}

	@Override
	public void ReadAllEntity() {
		String select="SELECT * FROM airport_details;";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("aid"));
				System.out.println(resultSet.getString("aname"));
				System.out.println(resultSet.getString("asource"));
				System.out.println(resultSet.getString("destination"));
				System.out.println(resultSet.getInt("noOfTerminals"));
				System.out.println(resultSet.getString("location"));
				System.out.println(resultSet.getBoolean("isInterntional"));
				System.out.println("----------------------");
			}
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed "+e.getMessage());
		} finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}	
		
	}

}
