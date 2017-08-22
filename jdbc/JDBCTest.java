package com.corejava.jdbc;


import java.sql.*;


public class JDBCTest {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement statement=connection.createStatement();
	//	statement.executeUpdate("INSERT INTO DEPT VALUES (50,'DEVELOPMENT','DELHI')");
	//	statement.executeUpdate("DELETE FROM DEPT WHERE LOC='DELHI'");
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE DEPT SET LOC='MUMBAI' WHERE LOC='BANGLORE'");
		preparedStatement.executeUpdate();
		
		ResultSet resultSet=statement.executeQuery("SELECT * FROM DEPT");
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt(1));
			System.out.print("\t"+resultSet.getString(2));
			System.out.print("\t"+resultSet.getString(3)+"\n");
			
		}

	}

}
