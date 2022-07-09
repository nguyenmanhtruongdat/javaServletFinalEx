package entity;

public class account {
	private String username;
	private String password;
	private int isUser;
	private int isAdmin;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getIsUser() {
		return isUser;
	}
	public void setIsUser(int isUser) {
		this.isUser = isUser;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public account() {
	}
	public account(String username, String password, int isUser, int isAdmin) {
		this.username = username;
		this.password = password;
		this.isUser = isUser;
		this.isAdmin = isAdmin;
	}
	
	public account(String username, String password) {
		this.username = username;
		this.password = password;
	}

}
