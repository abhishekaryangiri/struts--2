package javaYogi;

import java.util.List;

public class ViewCl {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
//		String p = userDAO.getViewDetail(11);
//		String[] t = p.split(",");
//		for(String q : t)
//		{
//		System.out.println(p);
//		}
		//Emp q = userDAO.getViewDetail(11);
		//System.out.println(q.getEid()+" "+q.getAdd()+" "+q.getName()+" "+q.getPhone());
		List<Emp> list = userDAO.getViewDetail();
		for(Emp q: list)
		{
			System.out.println(q.getEid()+" "+q.getAdd()+" "+q.getName()+" "+q.getPhone());
		}
	}

}
