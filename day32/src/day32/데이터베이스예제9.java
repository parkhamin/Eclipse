package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

public class 데이터베이스예제9 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select name, age from person");
		
		Calendar ca = Calendar.getInstance();
		int now = ca.get(Calendar.YEAR);
		
		while(rs.next()) {
			String name= rs.getString(1);
			int age = rs.getInt(2);
			int birth = now -age;
			
			//System.out.println(name+" "+age+" "+birth+"년");
			System.out.printf("%10s %2d세 %4d년\n", name,age,birth);
		}
	}
}
