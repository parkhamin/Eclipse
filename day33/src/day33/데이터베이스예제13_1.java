package day33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class 데이터베이스예제13_1 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming", "11111");

		String sql = "select name,age,height from person where age < 30 and height >= 180.5";

	    Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String name = rs.getString(1);
			int age = rs.getInt(2);
			double height = rs.getDouble(3);
			
			System.out.println(name+" "+age+" "+height);
		}
		con.close();
	}
}
