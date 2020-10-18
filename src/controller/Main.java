package controller;

import java.sql.Connection;
import java.util.Scanner;

import Utility.ConnectionManager;
import dao.UserOperation;
import model.Users;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//user u1 = new user();
UserOperation uo = new UserOperation();
UserController uc = new UserController();
		//ConnectionManager
		//model customer order
		//operations
//		ConnectionManager connectionmanager = new ConnectionManager();
//		Connection con = connectionmanager.getConnection();
		System.out.println("Welcome \n1. Insert \n2.Retrieve");
		Scanner sc = new Scanner(System.in);
		int options = sc.nextInt();
		switch(options){
		case 1:
			Users  u = uc.getdetails();
			uo.insertuserdetails(u);
			break;
		case 2:
			uo.retrieveuserdetails();
			break;
		}
	}

}
