package com.app.jdbc;


	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import com.app.probean.TCSRegistation;

	import java.sql.Connection ;
	public class FiveStep2 {
		
		static Connection connection=null;
		
		static void save(TCSRegistation registation) throws Exception,SQLException{
			
				//step-1 Register the Driver class
				Class.forName("com.mysql.jdbc.Driver");
				
				//step-2 Create Connection
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/TCSJdbc", "root", "root");
				System.out.println(connection);
				String sqlquery="INSERT INTO tcsregistation (TCSRegistationcolfname, TCSRegistationcolname, TCSRegistationcolmobile, TCSRegistationcolemail, TCSRegistationcoladhar, TCSRegistationcoladdress, TCSRegistationcolpancard, TCSRegistationcoldob, TCSRegistationcolEduction, TCSRegistationcolpassword, TCSRegistationcolrepassword, TCSRegistationcolemployeeid) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
				
				//step-3 create statement(PreparedStatement)
				PreparedStatement statement=connection.prepareStatement(sqlquery);
				statement.setString(1, registation.getTCSRegistationcolfname());
				statement.setString(2, registation.getTCSRegistationcolname());
				statement.setString(3, registation.getTCSRegistationcolmobile());
				statement.setString(4, registation.getTCSRegistationcolemail());
				statement.setString(5, registation.getTCSRegistationcoladhar());
				statement.setString(6, registation.getTCSRegistationcoladdress());
				statement.setString(7, registation.getTCSRegistationcolpancard());
				statement.setString(8, registation.getTCSRegistationcoldob());
				statement.setString(9, registation.getTCSRegistationcolEduction());
				statement.setString(10, registation.getTCSRegistationcolpassword());
				statement.setString(11, registation.getTCSRegistationcolrepassword());
				statement.setString(12, registation.getTCSRegistationcolemployeeid());
				
				//step-4 execute the query
				int status=statement.executeUpdate();
				String s1=(status>0)?"Successfully insert":"fail";
				
				/*if(status>0) {
					System.out.println("DONE");
				}else {
					System.out.println("FAIL");
				}*/
				
		}
	public static void main(String[] args) throws SQLException {
		TCSRegistation registation=new TCSRegistation();
		try {
		FiveStep2.save(registation);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			connection.close();
		}
		
	}
	}
