package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class 데이터베이스예제7 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		int row = st.executeUpdate("update person set height = (height+10) where height < 180");
		con.close();
		System.out.println(row+"행 수정완료");
	}
}
