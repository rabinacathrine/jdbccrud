package controller;

import java.util.Scanner;

import model.Users;

public class UserController {
	Scanner sc = new Scanner(System.in);
	public Users getdetails() {
		Users u;
		Scanner sc = new Scanner(System.in);
		int userid;
		String username;
		String useraddress;
		System.out.println("enter id");
		userid = sc.nextInt();
		System.out.println("enter username");
		username = sc.next();
		System.out.println("enter useraddress");
		useraddress = sc.next();
		
		 u = new Users(userid,username,useraddress);
		return u;
		
	}
}
