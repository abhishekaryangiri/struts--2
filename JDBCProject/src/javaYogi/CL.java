package javaYogi;

import java.util.Scanner;

public class CL {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter EId");
	int uid = Integer.parseInt(scan.nextLine());
	System.out.println("Enter Name");
	String n = scan.nextLine();
	System.out.println("Enter Add");
	String ad = scan.nextLine();
	System.out.println("Enter Mobile Number");
	String p = scan.nextLine();
	

	UserDAO userDAO = new UserDAO();
	if(userDAO.insert(uid, n, ad, p))
	{
		System.out.println("successfull");
	}
	else
	{
		System.out.println("please check your code");
	}
}
}
