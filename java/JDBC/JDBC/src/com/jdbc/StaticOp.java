package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOp {
	//crud
	public void saveEmp() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		 Statement stmt = con.createStatement();
		//  int rows = stmt.executeUpdate("insert into employe(eid,ename,esalary) values(3,'sanketh','5445')");
		  //int rows = stmt.executeUpdate("insert into employe(eid,ename,esalary) values(5,'saikrishna','545')");
		  int row1 = stmt.executeUpdate("insert into employe(eid,ename,esalary) values(6,'hieth','545')");
		  int rows= stmt.executeUpdate("delete from employe where eid= 2");
		  System.out.println("updated rows "+ rows);
		  con.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void GetEmploye() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rd =stmt.executeQuery("select * from employe");
			while(rd.next()) {
				int eid = rd.getInt(1);
				String name = rd.getString(2);
				String salary = rd.getString(3);
				System.out.println(eid+"  "+name+"  "+salary);
			}
		}catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}
	public static void main(String[] args) {
		StaticOp so = new StaticOp();
		//so.saveEmp();
		so.GetEmploye();
	}

}
