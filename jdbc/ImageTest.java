package com.corejava.jdbc;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class ImageTest {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement statement=connection.createStatement();
//		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO IMAGETEST VALUES (?,?)");
//		preparedStatement.setString(1, "demo");
//		preparedStatement.setBinaryStream(2, new FileInputStream("flip.jpg"));
//		preparedStatement.executeUpdate();
		
		PreparedStatement ps=connection.prepareStatement("select * from IMAGETEST");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("copy_of_img.jpg");  
		fout.write(barr);  
		              
		fout.close();  
		}//end of if  
	}

}

