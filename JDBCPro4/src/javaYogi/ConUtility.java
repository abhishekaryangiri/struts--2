package javaYogi;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConUtility {
//utility: pure connection ka single utilty
	private static Connection con = null;
	private ConUtility() 
	{
		
	}
	static 
	{
		try {
			Class.forName("org.postgresql.Driver");  //step1
			String url="jdbc:postgresql://localhost:5432/26Sep";
			 con = DriverManager.getConnection(url, "postgres", "postgres");
		} catch (Exception e) {
			
		}
	}
	public static Connection getConn()
	{
		return con;
	}
}
