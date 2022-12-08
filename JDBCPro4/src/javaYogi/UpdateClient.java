package javaYogi;

public class UpdateClient {
public static void main(String[] args) {
	UserDAO userDAO = new UserDAO();
	if(userDAO.update("8826930890", 3, "Bangalore".toUpperCase()))
	{
		System.out.println("success");
	}
	else
	{
		System.out.println("fail");
	}
}
}
