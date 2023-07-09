package com.jdbc.file;

import java.sql.*;


public class SelectFromDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
			
			String q = "select * from table1";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);
				System.out.println(id + ", " + name + ", " + city);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
