package day31;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class 데이터베이스예제2 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = null;

		String sql = "select name, day from fruit order by name";
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String name = rs.getString(1);
			Date d = rs.getDate(2);
			
			SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.d");
			String s = sd.format(d);
			
			System.out.printf("%10s %s\n",name,s);
		}
		con.close();
	}

}
