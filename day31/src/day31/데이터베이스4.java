package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class 데이터베이스4 {
	public static void main(String[] args) throws Exception {
		// localhost의 IPv4의 IP주소 127.0.0.1
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		String sql = "insert into person values(6,'brown',21,169.7)";
		//st.executeQuery(sql); // ResultSet을 리턴
		System.out.println(st.executeUpdate(sql));
		
		System.out.println("입력 성공");
		
		con.close();
	}
}
