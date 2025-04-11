package ex02_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB연결 전담 클래스
public class DBUtill {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "hr";
	private static final String password = "hr";
	
	//getConnection()메서드를 호출함녀 db와 연결할 수 있는 
	//conn 객체를 얻을 수 있다.
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
	//
}
