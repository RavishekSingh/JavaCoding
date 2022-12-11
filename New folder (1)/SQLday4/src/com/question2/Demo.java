package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url="jdbc:mysql://localhost:3306/web19sb101db";
	
		try {
			Connection conn= DriverManager.getConnection(url, "root", "ravishek@0578");
		
			 if(conn != null)
				 System.out.println("connected...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

