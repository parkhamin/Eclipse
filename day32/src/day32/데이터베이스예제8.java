package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class 데이터베이스예제8 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select id, name from person");
		//select id, name from person where mod(id,2)=0; 도 가능
		
		while(rs.next()) {
			int id = rs.getInt(1);
			if(id%2!=0) continue;
			String name = rs.getString(2);
			System.out.println(id+" "+name);
		}
		con.close();
	}
}
