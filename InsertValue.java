package com.jdbc.file;

import java.sql.*;

public class InsertValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
        	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
        	 
//        	 insert Query
        	 String q = "insert into table1(tName,tCity) values (?,?)";
        	 
//        	 get the PreparedStatement object
        	 PreparedStatement pstmt = con.prepareStatement(q);
        	 
//        	 Set the values to query
        	 pstmt.setString(1, "Abhisek Gupta");
        	 pstmt.setString(2, "Agra");
        	 
        	 pstmt.executeUpdate();
        	 
        	 System.out.println("Data inserted...");
        	 
        	 con.close();
        	 
         }
         catch(Exception e) {
        	 System.out.println(e);
         }
	}

}
