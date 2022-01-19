package com.xworkz.Company.DAO;
import java.sql.*;
public class CompanyDaoImpl implements CompanyDaoInterface{
	static String url="jdbc:mysql://localhost:3306/company";
	static String username="root";
	static String password="Prathu@123";
	@Override
	public void InsertEntity() {
		
		String insertq1="INSERT INTO details VALUES(06,'dell','kerala',false,150,'s',5)";
		
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertq1);
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
		String update="UPDATE details set grade='A' where cid=06";
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
		String delete="DELETE FROM details WHERE cid=6";
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
		String select="	SELECT * FROM details WHERE cid=2";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));//cid
				System.out.println(resultSet.getString(2));//cname
				System.out.println(resultSet.getString(3));//location
				System.out.println(resultSet.getBoolean(4));//isprivate
				System.out.println(resultSet.getInt(5));//noOfEmp
				System.out.println(resultSet.getString(6));//grade
				System.out.println(resultSet.getInt(7));//noOfBranches
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
		String selectAll="SELECT *FROM details";
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectAll);
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getBoolean(4));
				System.out.println(resultSet.getInt(5));
				System.out.println(resultSet.getString(6));
				System.out.println(resultSet.getInt(7));
				System.out.println("-----------------------");
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
