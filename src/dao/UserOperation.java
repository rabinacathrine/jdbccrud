package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Utility.ConnectionManager;
import model.Users;

public class UserOperation {

	ConnectionManager connectionmanager = new ConnectionManager();
	public  void insertuserdetails(Users u) throws Exception {
		
		Connection con = connectionmanager.getConnection();
		String sql ="Insert into users(userid,username,useraddress) Values(?,?,?)";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setInt(1, u.getUserid());
		smt.setString(2, u.getUsername());
		smt.setString(3,u.getUseraddress());
		
		int status=smt.executeUpdate();
		if(status>0) {
			System.out.println("insertion success");
		}
		else {
			System.out.println("insertion failed");
		}
	}
public void retrieveuserdetails() throws Exception{
	Connection con = connectionmanager.getConnection();
	String sql = "Select * from users";
	Statement smt = con.createStatement();
	ResultSet rs = smt.executeQuery(sql);
	while(rs.next()) {
		System.out.println(rs.getInt(1)+rs.getString(2));
	}
	
//		System.out.println("No data");
	
}
	
}
