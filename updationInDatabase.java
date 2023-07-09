package com.jdbc.file;

import java.sql.*;

import java.util.*;

public class updationInDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	    	
//	    	Connection con = ConnectionProvider.getConnection();
	    	
	    	Class.forName("com.mysql.jdbc.Driver");   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");  
	    	
	    	String q = "update table1 set tName=?, tCity=? where tId=?";
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter new name: ");
	    	String name = sc.nextLine();
	    	
	    	System.out.println("Enter new city name: ");
	    	String city = sc.nextLine();
	    	
	    	System.out.println("Enter the employee id: ");
	    	int id = Integer.parseInt(sc.nextLine());
	    	
//	    	System.out.println(con);
	    	
	    	PreparedStatement pstmt = con.prepareStatement(q);
	    	pstmt.setString(1, name);
	    	pstmt.setString(2, city);
	    	pstmt.setInt(3, id);
	    	
	    	pstmt.executeUpdate();
	    	
	    	System.out.println("updated...");
	    	
	    	con.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		

	}

}
