package day31;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

public class 데이터베이스3 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = null;

		String sql = "select orderid, orderdate from orders";
		rs = st.executeQuery(sql);

		rs.next();

		int num = rs.getInt(1);
		Date d = rs.getDate(2);
		Calendar ca = Calendar.getInstance();

		ca.setTime(d);
		int year = ca.get(Calendar.YEAR);
		int mon = ca.get(Calendar.MONTH);
		int day = ca.get(Calendar.DATE);

		System.out.print(num + " ");
		System.out.printf("%d년%d월%d일 \n", year, mon, day);

		con.close();
	}
}
