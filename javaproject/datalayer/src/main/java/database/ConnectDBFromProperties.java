package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectDBFromProperties {
	private static String getConnectionURLFromClassPath(){
		String strCon = null;
		
		try(
			FileInputStream file = new FileInputStream("db.properties");
		){
			Properties prop = new Properties();
			prop.load(file);
			strCon = prop.getProperty("url") + prop.getProperty("serverName")
					+ ":" + prop.getProperty("portNumber")
					+ ";databaseName=" + prop.getProperty("databaseName")
					+ ";user=" + prop.getProperty("username")
					+ ";password=" + prop.getProperty("password");
		} catch (Exception e) {
			e.printStackTrace();
			strCon = null;
		}
		
		return strCon;
	}
	
	public static Connection getConnectionFromClassPath() {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(getConnectionURLFromClassPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	
	}
	
}
