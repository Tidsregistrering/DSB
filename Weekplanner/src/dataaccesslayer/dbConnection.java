package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://weekplanner:3306/";
        String dbName = "ococsizw_weekplanner";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "ococsizw_user";
        String password = "26yYR862";

        Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection(url + dbName, userName,password);

        return conn;       
    }

	public static void closeConnection(Connection conn) {
		try {

	        conn.close();

	    } catch (SQLException e) {

	    }
		
	}

	
	
}

