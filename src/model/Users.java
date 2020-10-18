package model;

public class Users {

	private int userid;
	private String username;
	private String useraddress;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public Users(int userid, String username, String useraddress) {
		super();
		this.userid = userid;
		this.username = username;
		this.useraddress = useraddress;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
