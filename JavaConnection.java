package com.jdbc.file;

import java.sql.Connection;
import java.sql.DriverManager;


public class JavaConnection {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");   
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");  
			
//			here Employee is database name, root is username and password  
			if(con.isClosed()) {
				System.out.println("Connection is closed....");
			}
			else {
				System.out.println("Connected is created");
			}			  
			con.close();  
		}
		catch(Exception e){
			System.out.println(e);		
		}  
			
	}  

	

}
