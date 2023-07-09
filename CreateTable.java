package com.jdbc.file;
import java.sql.*;

public class CreateTable {
      public static void main(String[] args) {
    	  try {
    		  Class.forName("com.mysql.jdbc.Driver"); 
    		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root"); 
    		  
//    		  create Query
    		  String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
    	  
//    		  create a statement
    		  Statement stmt = con.createStatement();
    		  stmt.executeUpdate(q);
    		  
    		  System.out.println("Table is created in database....");
    		  con.close();
    	  }
    	  catch(Exception e){
    		  System.out.println(e);	
    	  }
      }
}
