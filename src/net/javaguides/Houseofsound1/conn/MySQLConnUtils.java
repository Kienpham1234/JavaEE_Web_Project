package net.javaguides.Houseofsound1.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnUtils {
	public static Connection getMySQLConnection()
	         throws ClassNotFoundException, SQLException {
	     String hostName = "localhost";
	     String dbName = "instruments";
	     String userName = "kien";
	     String password = "kien123";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	  
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	    
	     Class.forName("com.mysql.jdbc.Driver");
	  

	     String connectionURL = "jdbc:mysql://" + hostName + ":3308/" + dbName;
	  
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}

