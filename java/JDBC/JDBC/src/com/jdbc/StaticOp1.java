package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOp1 {

	//crud
	public void saveEmp() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		 Statement stmt = con.createStatement();
		 int rows = stmt.executeUpdate("update employe set esalary='452' where eid =1 ");
		// int row = stmt.executeUpdate("update employe set ename='varma'where eid =3 ") ;
		 int row2 = stmt.executeUpdate("alter table employe change esalary  sal varchar(4)");
		  System.out.println("updated rows "+ rows);
		  System.out.println("coloumn updated "+row2);
		  
		  con.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		StaticOp1 so = new StaticOp1();
		//so.saveEmp();
		
	}



}
