package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class 데이터베이스예제10 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select round(avg(age),1) from person");
		rs.next();
		double avg = rs.getDouble(1);
		//String sql = "select name, age from person where age> +avg";
		
		//subQuery를 이용하면
		String sql = "select name, age from person where age >(select avg(age) from person)";
		ResultSet rs2 = st.executeQuery(sql);
		
		System.out.println("평균 나이: "+avg+"살");
		while(rs2.next()) {
			String name = rs2.getString(1);
			int age = rs2.getInt(2);
			System.out.println(name+" "+age+"살");
		}
		con.close();
	}
}
