package com.app.preparedstatement;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class PreparedStatement {
	 

	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatpoint","root","root");  
	  
	java.sql.PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?)");  
	stmt.setInt(1,101);//1 specifies the first parameter in the query  
	stmt.setString(2,"Ratan");
	stmt.setString(3,"22");  
	stmt.setString(4,"Ratan@gmail.com");  
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  
