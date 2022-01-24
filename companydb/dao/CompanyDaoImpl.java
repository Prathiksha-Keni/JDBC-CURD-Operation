package com.xworkz.companydb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.companydb.CompanyUtil.ConnectionProvider;
import com.xworkz.companydb.companyentity.CompanyEntity;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public void insertEntity(CompanyEntity companyEntity) {

		String insertq1 = "INSERT INTO details VALUES(?,?,?,?,?,?,?)";

		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);

			PreparedStatement preparedstatement = connection.prepareStatement(insertq1);
			preparedstatement.setInt(1, companyEntity.getCid());
			;
			preparedstatement.setString(2, companyEntity.getCname());
			preparedstatement.setString(3, companyEntity.getLocation());
			preparedstatement.setBoolean(4, companyEntity.isIsprivate());
			preparedstatement.setInt(5, companyEntity.getNoOfEmp());
			preparedstatement.setString(6, companyEntity.getGrade());
			preparedstatement.setInt(7, companyEntity.getNoOfBranches());
			preparedstatement.executeUpdate(insertq1);
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed " + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}
	}

	@Override
	public void updateEntity(String grade, int id) {
		String update = "UPDATE details set grade=? where cid=?";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			;
			System.out.println(connection);
			PreparedStatement preparedstatement = connection.prepareStatement(update);
			preparedstatement.setString(1, grade);
			preparedstatement.setInt(2, id);
			preparedstatement.executeUpdate();
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed " + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}

	}

	@Override
	public void deleteEntity(int id) {
		String delete = "DELETE FROM details WHERE cid=?";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			PreparedStatement preparedstatement = connection.prepareStatement(delete);
			preparedstatement.setInt(1, id);
			preparedstatement.executeUpdate();
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed " + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}

	}

	@Override
	public void readEntity() {
		String select = "SELECT * FROM details WHERE cid=2";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(select);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));// cid
				System.out.println(resultSet.getString(2));// cname
				System.out.println(resultSet.getString(3));// location
				System.out.println(resultSet.getBoolean(4));// isprivate
				System.out.println(resultSet.getInt(5));// noOfEmp
				System.out.println(resultSet.getString(6));// grade
				System.out.println(resultSet.getInt(7));// noOfBranches
			}
			System.out.println("Query executed");
		} catch (SQLException e) {
			System.out.println("Query not executed " + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}

	}

	@Override
	public void readAllEntity() {
		String selectAll = "SELECT *FROM details";
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectAll);

			while (resultSet.next()) {
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
			System.out.println("Query not executed " + e.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e2) {
			}
		}

	}

}
