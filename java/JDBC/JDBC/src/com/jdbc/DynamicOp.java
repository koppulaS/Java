package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DynamicOp {
	
	
	static String insert_query= "insert into employe(eid,ename,sal) values(?,?,?)";
	static String update_query = "update employe set sal = ?  where eid =?"; 
	static String delete_query = "delete from employe where eid =? ";
	static String read_query = "select * from employe";
	
	public void saveEmploye() throws SQLException {
		Connection con = null;
		
		con=JdbcUtil.creatingConnection();
		try {
			PreparedStatement ptst=con.prepareStatement(insert_query);
			ptst.setInt(1, 8);
			ptst.setString(2, "saii");
			ptst.setString(3, "6879");
			int rows = ptst.executeUpdate();
			System.out.println("effectected rows are  "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		}
	
	public void UpdateEmp() {
		Connection co = null;
		co = JdbcUtil.creatingConnection();
		
		try {
			PreparedStatement ptt = co.prepareCall(update_query);
			ptt.setInt(2, 8);
			ptt.setString(1, "784");
			int rows = ptt.executeUpdate();
			System.out.println("updated "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void DelEmp() {
		Connection co = null;
		co = JdbcUtil.creatingConnection();
		
		try {
			PreparedStatement ptt = co.prepareCall(delete_query);
			ptt.setInt(1,3);
			ptt.setInt(1, 9);
			int rows = ptt.executeUpdate();
			System.out.println("deleted "+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void GetDetail() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection co =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
				Statement st = co.createStatement();
				ResultSet rr = st.executeQuery(read_query);
				while(rr.next()) {
			int e =	rr.getInt(1);
				String s=	rr.getString(2);
					String k =rr.getString(3);
					System.out.println(e+" "+k+" "+s);
				}
			} catch (SQLException|ClassNotFoundException e) {
			
				e.printStackTrace();
			}
		
		
	}
	
	public static void main(String[] args) throws SQLException {
		DynamicOp dop = new DynamicOp();
		//dop.saveEmploye();
		//dop.UpdateEmp();
		//dop.DelEmp();
		dop.GetDetail();
	}
	

}
