package DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBContext {
	private static DBContext instance;
	
	public static DBContext getInstance() {
		if (instance==null) {
			instance= new DBContext();
		}
		return instance;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String host = "jdbc:mysql://localhost:3306/hethongktx";
		String username = "root";
		String password ="";
		return DriverManager.getConnection(host, username, password);
	}	
	public static void main(String[] args) {
		DBContext db = new DBContext();
		try {
			Connection cnn =db.getConnection();
			if (cnn==null) {
				System.out.println("thatbai");
			}else {
				System.out.println("thanh cong");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
