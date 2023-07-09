package com.jdbc.file;

import java.sql.*;
import java.io.*;

public class InsertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
			
//			create table for insertion of images 
//			String q = "create table images(id int prtimary key auto_increment, pic longblob)";
			
//			create statement
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate(q);
//			
//			System.out.println("Table is created...");
			
			String imgQuery = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(imgQuery);
			
//			pstmt.setString(1, "value"); ---> We can't do this because images are not string
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Pictures\\bappa.jpg");
			pstmt.setBinaryStream(1, fis,fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("image inserted");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
