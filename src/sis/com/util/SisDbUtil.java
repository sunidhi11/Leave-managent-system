package sis.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SisDbUtil {
	static{
		try {
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.jdbc.Driver");  
				System.out.println("driver loaded");
			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//catch
	}//static
	
	
	//private static  String url="jdbc:oracle:thin:@localhost:1521:XE";
	//private static  String url="jdbc:mysql://138.197.13.255:3306/mydb";
	private static  String url="jdbc:mysql://localhost:3306/leave_management";
	private static  String user="root";
	private static  String pass="root";
	
	public static Connection getConnection() throws SQLException{
		Connection con  = DriverManager.getConnection(url,user,pass);
		//Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/sunidhi","root","root"); 
		return con;
	}//getconnection()
	
	public static void closeConnection(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}//if
	}//closeConnection()
}//dbUtil
