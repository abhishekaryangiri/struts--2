package javaYogi;

public class CL {
public static void main(String[] args) {
	int uid=12;
	String name="Ramdyalu";
	String add="Greater noida";
	String phone="8888330890";

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
