


import java.sql.*;

public class conn {

	Connection c;   //2.for connection
	Statement s;    //3.crating satement can execute sql quries
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");  //1.mysql driver install  //add connector jar file in javaproject libraries  
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","1234"); //connection string   connection path and last database name
			s = c.createStatement();		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
				
	}
}
