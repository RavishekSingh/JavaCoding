package com.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//To insert values
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Roll :");
		int roll = sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String name=sc.next();
		
		System.out.println("Enter Student Address:");
		String address=sc.next();
		
		System.out.println("Enter Student mobile:");
		String mobile=sc.next();
		
		System.out.println("Enter Course ID :");
		int cid = sc.nextInt();
		
		System.out.println("Enter Course Name:");
		String cname=sc.next();
		
		System.out.println("Enter Course Fee :");
		int fee = sc.nextInt();
		
		System.out.println("Enter Cousre Duration:");
		String duration=sc.next();
		
		
		//To print Course details by Student roll
		
//		System.out.println("Enter Student Roll :");
//		int roll = sc.nextInt();
		
		
		
		
	//To print Student details by Course
		
//		System.out.println("Enter Course :");
//		String cname=sc.next();
		
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/web19sb101db";
		
		try (Connection conn= DriverManager.getConnection(url, "root", "ravishek@0578")){
			
			
			//To insert details.
			PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setString(4, mobile);
			
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("record inserted");
			else
				System.out.println("not inserted");
			
			
			PreparedStatement ps1=conn.prepareStatement("insert into course values(?,?,?,?)");
			ps1.setInt(1, cid);
			ps1.setString(2, cname);
			ps1.setInt(3, fee);
			ps1.setString(4,duration);
			
			int x1=ps1.executeUpdate();
			if(x1>0)
				System.out.println("record inserted");
			else
				System.out.println("not inserted");
			
			
			
			
			//To print Course details by Student roll
			
//			PreparedStatement ps=conn.prepareStatement("select c.cid,c.cname,c.fee,c.duration from course c INNER JOIN student s INNER JOIN student_course sc ON sc.roll=s.roll AND sc.cid=c.cid AND s.roll=? ");
// 
//			ps.setInt(1, roll);
//			
//			ResultSet rs=ps.executeQuery();
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("cid"));
//				System.out.println(rs.getString("cname"));
//				System.out.println(rs.getInt("fee"));
//				System.out.println(rs.getString("duration"));
//				
//				System.out.println("====================================");
//			}
			
			
			
			
			
			
			
			//To print Student details by Course
			
//			PreparedStatement ps=conn.prepareStatement("select s.roll,s.name,s.address,s.mobile from course c INNER JOIN student s INNER JOIN student_course sc ON sc.roll=s.roll AND sc.cid=c.cid AND c.cname=? ");
// 
//			ps.setString(1, cname);
//			
//			ResultSet rs=ps.executeQuery();
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("roll"));
//				System.out.println(rs.getString("name"));
//				System.out.println(rs.getString("address"));
//				System.out.println(rs.getString("mobile"));
//				
//				System.out.println("====================================");
//			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
