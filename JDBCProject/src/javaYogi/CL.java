package javaYogi;

public class CL {
public static void main(String[] args) {
	int uid=11;
	String name="raja";
	String add="noida";

	UserDAO userDAO = new UserDAO();
	userDAO.insert(uid, name, add);
}
}
