package DOA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	String Server;
	String User;
	String Password;
	String Database;
	String jdbcurl;
	Connection conn;
	public MyConnection() {
		User = "root";
		Password = "maherj96";
		Database = " J.S. Airlines";
		jdbcurl= "jdbc:mysql://localhost:3306/J.S.Airlines?useSSL=false";
		
	}	
	public Connection getConnect() {
		try {
			conn = DriverManager.getConnection(jdbcurl,User,Password);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	return conn;			
	}

}
