package com.jdbc.file;

import java.io.*;
import java.sql.*;
import javax.swing.*;

public class FileChooserForImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Connection c = ConnectionProvider.getConnection();
			
			Class.forName("com.mysql.jdbc.Driver");   
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");  
			
			 String q = "insert into images(pic) values(?)";
			 
			 PreparedStatement pstmt = c.prepareStatement(q);
			 
			 JFileChooser jfc = new JFileChooser();
			 jfc.showOpenDialog(null);
			 
			 File file = jfc.getSelectedFile();
			 
			 FileInputStream fis = new FileInputStream(file);
			 
			 pstmt.setBinaryStream(1, fis, fis.available());
			 
			 pstmt.executeUpdate();
			 
			 System.out.println("Inserted......");
			 c.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
