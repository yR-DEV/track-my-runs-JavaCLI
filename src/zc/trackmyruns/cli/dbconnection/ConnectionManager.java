package zc.trackmyruns.cli.dbconnection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	private static Connection connection = null;
	
	private static void makeConnection() {
		Properties connectionProps = new Properties();
		
		try {
			connectionProps.load(new FileInputStream("./resources/config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Accessing variables in config file
		String url = connectionProps.getProperty("url");
		String username = connectionProps.getProperty("username");
		String password = connectionProps.getProperty("password");
		
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		if (connection == null) {
			makeConnection();
		}
		return connection;
	}
	
}
