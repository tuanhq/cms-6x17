package org.thq.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements DBConnection {
	private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://127.0.0.1:3306/smsgw";
	// "jdbc:mysql://125.212.192.237:3306/smsgw";
	private String USER = "smsgw";
	private String PASS = "123456";
	/* (non-Javadoc)
	 * @see org.thq.database.DBConnection#makeConnection()
	 */
	
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL, USER, PASS);		
		return conn;
	}

	

	

}
