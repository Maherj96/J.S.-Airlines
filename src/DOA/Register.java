package DOA;

import java.sql.Connection;
import java.sql.DriverManager;

public class Register {
	
	try {
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/J.S. Airlines","root" ,"maherj96");
		
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

		}

	}



