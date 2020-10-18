package Utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {

	
public Connection getConnection() throws Exception {
	
//	Connection con =null;
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	Class.forName("oracle.jdbc.OracleDriver");
	if(con!=null) {
	System.out.println("connection is  established");
	}
////}
	return con;
//	Properties newprop = new Properties();	
//	newprop = loadPropertiesFile();
//	
//	String driver, url,password,username;
//	try {
//	driver = newprop.getProperty("driver");
//		
//	
//	
//	url = newprop.getProperty("url");
//	password = newprop.getProperty("password");
//	username = newprop.getProperty("username");
//	Class.forName(driver);
//	
//	Connection con = DriverManager.getConnection(url,username,password);
//	//Connection con = DriverManager.getConnection();
////	if(con==null) {
////		System.out.println("connection is not established");
////	}
////	else {
////		System.out.println("connection not established");
////	}
////	
////	return con;
//	}catch(Exception e ) {
//		System.out.println("invalid creds");
//	}
//	return null;
//
//}
//public static Properties loadPropertiesFile() throws Exception {
//	Properties prop = new Properties();	
//	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
//	prop.load(in);
//	in.close(); 
//	return prop;
//}
}
}
