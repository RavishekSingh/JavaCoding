package com.masai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddStudent {


	@Autowired
	private Student s1;
	
	public String register(Connection conn) {
		
		try {
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?)");
			ps.setInt(1, s1.getRoll());
			ps.setString(2, s1.getName());
			ps.setInt(3, s1.getMarks());
			
			int x = ps.executeUpdate();
			
			if(x > 0) return "Student added ";
			else return "Student not added";
			
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
