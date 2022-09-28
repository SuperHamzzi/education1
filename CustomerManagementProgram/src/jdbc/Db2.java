package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class Db2 {
	private Connection conn;
	public Db2() {
		String url="jdbc:mysql://localhost:3306/myab";
		String user ="abcd";
		String pass="1234";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
