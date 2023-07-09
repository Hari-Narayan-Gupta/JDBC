package com.jdbc.file;

import java.sql.*;

public class ConnectionProvider {
	
		private static Connection con;
		
		public static Connection getConnection() {
			try {
			  if(con==null) {				
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
					
					System.out.println("connection created....");
				}
			}
			 catch (Exception e) {
					e.printStackTrace();
				}
			return con;
		 }
		

}
