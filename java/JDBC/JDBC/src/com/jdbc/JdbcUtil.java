package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	static String url="jdbc:mysql://localhost:3306/jdbc"; 
	static String user ="root";
	static String password ="root";
	
	public static  Connection creatingConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				con= DriverManager.getConnection(url, user, password);
			} catch (SQLException |ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		
		return con ;
		
		}	
	
}
