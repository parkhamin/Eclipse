package day33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class 데이터베이스예13 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1522:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming", "11111");

		String sql = "select name,age,height from person where age < ? and height >= ?";

		PreparedStatement pst = con.prepareStatement(sql);

		pst.setInt(1, 30);
		pst.setDouble(2, 180.5);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString(1);
			int age = rs.getInt(2);
			double height = rs.getDouble(3);
			
			System.out.println(name+" "+age+" "+height);
		}
		con.close();
	}
}
