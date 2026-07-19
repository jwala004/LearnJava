package com.app.db;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	public class Employee {
		
		String fname;
		String lname;
		String email;
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		void save(Employee employee) {
			try {
				//1-step "register the Driver class
				Class.forName("com.mysql.jdbc.Driver");
				//2-step " create connection
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
				//3-create statement
				String query="insert into emp (fname,lname,email) values(?,?,?)";
				PreparedStatement statement=connection.prepareStatement(query);
				statement.setString(1, employee.fname);
				statement.setString(2, employee.lname);
				statement.setString(3, employee.email);
				//step-4 execute query
				int i=statement.executeUpdate();
				if(i>0) {
					System.out.println("Save Successfully");
				}else {
					System.out.println("Something Worng");
				}
				//step-5 close the connection object
				//connection.commit();
				connection.close();
				
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		
		public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmail("jwala@gmail.com");
		employee.setFname("jwala");
		employee.setLname("singh");
		employee.save(employee);
		}

	}
