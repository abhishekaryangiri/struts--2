package javaYogi;

public class CL {
public static void main(String[] args) {
	int uid=11;
	String name="Shankram";
	String add="noida";
	String phone="8826930890";

	UserDAO userDAO = new UserDAO();
	if(userDAO.insert(uid, name, add, phone))
	{
		System.out.println("successfull");
	}
	else
	{
		System.out.println("please check your code");
	}
}
}
