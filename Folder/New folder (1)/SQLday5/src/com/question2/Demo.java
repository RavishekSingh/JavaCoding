package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Department ID :");
//		int did = sc.nextInt();
//
//		System.out.println("Enter Department name :");
//		String dname = sc.next();
//
//		System.out.println("Enter location");
//		String location = sc.next();
//
//		System.out.println("Enter Employee ID :");
//		int empid = sc.nextInt();
//
//		System.out.println("Enter Employee name :");
//		String ename = sc.next();
//
//		System.out.println("Enter Employee address");
//		String address = sc.next();
//		
//		System.out.println("Enter Employee phone number");
//		String mobile = sc.next();
//		
//		System.out.println("Enter Department ID :");
//		int deptid = sc.nextInt();
//		
        // Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter the Department ID to delete :");
//		int did= sc.nextInt();
		
	      try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String url = "jdbc:mysql://localhost:3306/web19sb101db";
	      
	      try(Connection conn = DriverManager.getConnection(url, "root", "ravishek@0578")) {
			
//	    	 PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");
//	    	
//	    	 ps.setInt(1, did);
//				 ps.setString(2, dname);
//				 ps.setString(3, location);
//				 int x= ps.executeUpdate();
//				if(x>0) {
//				System.out.println("record inserted");
//			
//			}	else
//				System.out.println("not inserted");
//				
//				 PreparedStatement ps1 = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
//				 
//				 ps1.setInt(1, empid);
//				 ps1.setString(2, ename);
//				 ps1.setString(3, address);
//				 ps1.setString(4,mobile);
//				 ps1.setInt(5, deptid);
//				 int x1= ps1.executeUpdate();
//				if(x1>0) {
//				System.out.println("record inserted");
//			
//			}	else
//				System.out.println("not inserted");
	    	  
	    	  
//	    		PreparedStatement ps= conn.prepareStatement("select * from department d INNER JOIN employee e ON d.did = e.deptid AND d.dname = 'Account'");
//			 	
//	    		ResultSet rs = ps.executeQuery();	
	    		 
	    		
//	    		while(rs.next()) {
//	    			
//	    			
//	    			int r= rs.getInt("did");
//	    			String n= rs.getString("dname");
//	    			String m= rs.getString("location");
//	    			
//
//	    			int a= rs.getInt("empid");
//	    			String b= rs.getString("ename");
//	    			String c= rs.getString("address");
//	    			String d= rs.getString("mobile");
//	    			int e= rs.getInt("deptid");
//	    			
//	    			System.out.println("Department ID is :"+r);
//	    			System.out.println("Name is :"+n);
//	    			System.out.println("Location is :"+m);
//	    			
//	    			System.out.println("Employee ID is :"+a);
//	    			System.out.println("Employee Name is :"+b);
//	    			System.out.println("Address is :"+c);
//	    			System.out.println("Phone is :"+d);
//	    			System.out.println("Dept ID is :"+e);
//	    			
//	    			
//	    			System.out.println("=============================");
//	    			
//	    		}
	    		
	    		
	    		
//	    		PreparedStatement ps= conn.prepareStatement("delete from department where did = ? ");
//			 	
//	    		ps.setInt(1, did);	
//	    		
//	    		int x= ps.executeUpdate();	
//	    		 
//	    		if(x > 0)
//	    			System.out.println(x+ " Record deleted Sucessfully");
//	    		else
//	    			System.out.println("Record does not exist.");
	    	  
	    	  
	    	  
	    	  PreparedStatement ps= conn.prepareStatement("select * from department d INNER JOIN employee e ON d.did = e.deptid AND e.address= 'Mumbai'");
			 	
	    		ResultSet rs = ps.executeQuery();	
	    		 
	    		
	    		while(rs.next()) {
	    			
	    			
	    			int r= rs.getInt("did");
	    			String n= rs.getString("dname");
	    			String m= rs.getString("location");
	    			

	    			int a= rs.getInt("empid");
	    			String b= rs.getString("ename");
	    			String c= rs.getString("address");
	    			String d= rs.getString("mobile");
	    			int e= rs.getInt("deptid");
	    			
	    			System.out.println("Department ID is :"+r);
	    			System.out.println("Name is :"+n);
	    			System.out.println("Location is :"+m);
	    			
	    			System.out.println("Employee ID is :"+a);
	    			System.out.println("Employee Name is :"+b);
	    			System.out.println("Address is :"+c);
	    			System.out.println("Phone is :"+d);
	    			System.out.println("Dept ID is :"+e);
	    			
	    			
	    			System.out.println("=============================");
	    			
	    		}
	    	  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	      
	      
	      
	      
	      
	      
	      
	}

}
