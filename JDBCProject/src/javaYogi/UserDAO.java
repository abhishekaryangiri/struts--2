package javaYogi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {
	
	public boolean insert(int uid, String name, String add, String phone) 
	{
		try {//java se db me jane p try catch lgana padega
			Class.forName("org.postgresql.Driver");  //step1
			String url="jdbc:postgresql://localhost:5432/26Sep";
			Connection con = DriverManager.getConnection(url, "postgres", "postgres"); //step2
			//connection interface is a factory of statement,prepared statement, and callable statement
			//statement: 1. jaha static query fire krna ho, 2. query everytime compile and exicutre hoti h, 3. Insecure hota h( bcz koe v sql injection de skta h)
			//prepared stat: 1. jaha parametrise(dynamic) fire krna ho, 2.  query first time compile hoga second time exicute exicuting ( pre compiled) hota h, 3.no sql injection
			
			PreparedStatement ps = con.prepareStatement("insert into emp values( ?, ?, ?, ?)");//step3
			ps.setInt(1, uid);
			ps.setString(2, name);
			ps.setString(3, add);
			ps.setString(4, phone);
			
			int i = ps.executeUpdate(); //step4
			if(i>0) 
			{
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
		//boolean: to see return true or false(agr database me value insert ho jay to true bata dega otherwise false)
		//System.out.println(uid +" --- "+ name +" --- "+ add); //replace boolean with void
	}
}
