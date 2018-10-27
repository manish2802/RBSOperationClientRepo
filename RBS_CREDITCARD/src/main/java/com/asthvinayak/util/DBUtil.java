package com.asthvinayak.util;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 public class DBUtil {
	
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/webservice";
	private static String USER_NAME = "root";
	private static String PASSWORD = "shyam";
 	/**
	 * for getting connection
	 * @author SHYAM
	 * @
	 * @return con
	 */
	public static Connection getConnection()
	{
		
		Connection con = null;
		try {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeConnection(Connection con, PreparedStatement psmt)
	{
		
		try{
			if(con != null)
			{
				con.close();
			}
			if(psmt != null)
			{
				psmt.close();
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
 }