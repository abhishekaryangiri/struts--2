package javaYogi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	public boolean update(String phone, int eid, String add)
	{
		try {
			Connection con = ConUtility.getConn();
			PreparedStatement ps = con.prepareStatement("update emp set phone=? , add=? where eid=?");
		
			ps.setString(1, phone);
			ps.setString(2, add);
			ps.setInt(3, eid);
			
			int i = ps.executeUpdate();
			if(i>0)
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean insert(int uid,String n,String add,String mob)
	{
		try {
			Connection con = ConUtility.getConn();
			PreparedStatement ps = con.prepareStatement("insert into emp values (?, ?, ?, ?)");
 ps.setInt(1, uid);
 ps.setString(2, n);
 ps.setString(3, add);
 ps.setString(4, mob);
  int i= ps.executeUpdate();
    if(i>0)
    	return true;
  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
		//boolean: to see return true or false(agr database me value insert ho jay to true bata dega otherwise false)
		//System.out.println(uid +" --- "+ name +" --- "+ add); //replace boolean with void

	public Emp getViewDetail(int eid)
	{
		Emp e = new Emp();
		//List<String> l=new ArrayList<String>();
		try {
			Connection con = ConUtility.getConn();
			PreparedStatement ps = con.prepareStatement("select * from emp where eid=?");
			ps.setInt(1, eid);
			
		//	Statement s = con.createStatement();
			//ResultSet rs = s.executeQuery("select * from emp where eid="+eid+"");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
	e.setEid(rs.getInt("eid"));
	  e.setName(rs.getString("name"));
	  e.setAdd(rs.getString("add"));
	  String p=(rs.getString("phone")==null || rs.getString("phone").length()==10)? "0000000":rs.getString("phone");
		e.setPhone(p);
	  
	//return id+","+n+","+add+","+p;
			}
			
			
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return e;
	}
	public List<Emp> getViewDetail()
	{
		List<Emp> l = new ArrayList<Emp>();
		try {
			Connection con = ConUtility.getConn();
			PreparedStatement  ps = con.prepareStatement("select * from emp");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				Emp e = new Emp();
				e.setEid(rs.getInt("eid"));
				e.setName(rs.getString("name"));
				e.setAdd(rs.getString("add"));			
				String p = (rs.getString("phone")==null ) ? "0000000":rs.getString("phone");
				e.setPhone(p);
				l.add(e);
				//return id+","+n+","+add+","+p;
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return l;
	}
}
