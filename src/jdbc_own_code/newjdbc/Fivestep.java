package com.app.newjdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection ;

public class Fivestep {
	
	 public static void main(String[] args) {

		try {
			//step-1 Register the Driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step-2 Create Connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/TCSJdbc", "root", "root");
	
			
			//step-3 create statement(PreparedStatement)
			PreparedStatement statement=connection.prepareStatement("INSERT INTO tcsregistation VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, "2");
			statement.setString(2, "jwala");
			statement.setString(3, "kumar");
			statement.setString(4, "8920065293");
			statement.setString(5, "jkkj004@gmail.com");
			statement.setString(6, "1111111111");
			statement.setString(7, "Noida");
			statement.setString(8, "XYZ1234");
			statement.setString(9, "18/11/95");
			statement.setString(10, "B.Tech");
			statement.setString(11, "1234");
			statement.setString(12, "1234");
			statement.setString(13, "A20");
			
			//step-4 execute the query
			int status=statement.executeUpdate();
			String s1=(status>0)?"Successfully insert":"fail";
			System.out.println(s1);
		//step-5 close the connection
		connection.close();
		}catch (Exception e) {
			System.out.println(e); 
		}
	 }
}