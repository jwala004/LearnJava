package com.app.jdbc1;
import java.sql.*; 

public class JavaTPoint {
	

	  // fetch the data from database(SELECT query)  
	
		public static void main(String args[]) {
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/javatpoint","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");
		
		
		while(rs.next()) 
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}  
	}  
	
	// INSERT values into database(code for inserting values into database)
	
	/*public static void main(String[] args) {
		try {

	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatpoint","root","root");  
	//here sonoo is database name, root is username and password  
	Statement stmt=con.createStatement();  
	int result=stmt.executeUpdate("insert into employee values(13, 'jwala', 22, 'jjjjj@gmail.com')"); 
	System.out.println(result+  "record inserted");
	
	con.close();  
	
	}catch(Exception e){ System.out.println(e);}  
	
	}  
}*/