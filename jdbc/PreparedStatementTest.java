package com.corejava.jdbc;

import java.sql.*;

public class PreparedStatementTest {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement statement=connection.createStatement();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPCOPY VALUES (?,?,?,?,?,?,?,?)");
		
		ResultSet resultSet=statement.executeQuery("SELECT * FROM EMP");
		while(resultSet.next())
		{
			preparedStatement.setInt(1, resultSet.getInt(1));
			preparedStatement.setString(2, resultSet.getString(2));
			preparedStatement.setString(3, resultSet.getString(3));
			preparedStatement.setInt(4, resultSet.getInt(4));
			preparedStatement.setDate(5, resultSet.getDate(5));
			preparedStatement.setInt(6, resultSet.getInt(6));
			preparedStatement.setInt(7, resultSet.getInt(7));
			preparedStatement.setInt(8, resultSet.getInt(8));
			preparedStatement.executeUpdate();
		}

	}

}

