package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class 데이터베이스2 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select bookname, publisher, price from book where bookname like \'%축구%\'");
	
		while(rs.next()) {
			String s1 = rs.getString(1);
			String s2 = rs.getString(2);
			int a =rs.getInt(3);
			
			System.out.println(s1+", "+s2+","+a+"원");
			}
		con.close();
	}
}
