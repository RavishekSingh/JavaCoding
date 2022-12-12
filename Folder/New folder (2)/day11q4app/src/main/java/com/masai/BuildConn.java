package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BuildConn {

	@Autowired
	public Environment evn;
	
	public Connection getConn()
	{
		Connection conn = null;
		
		try {
			Class.forName(evn.getProperty("db.driverName"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			conn = DriverManager.getConnection(evn.getProperty("db.url"), evn.getProperty("db.username"), evn.getProperty("db.password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
