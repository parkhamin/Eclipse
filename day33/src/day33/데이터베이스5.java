package day33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class 데이터베이스5 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"c##haming","11111");
		
		String sql = "select id, name from person where id = ?";
		// PreparedStatement는 실행할 sql문 형식을 미리 지정해둠.
		// 지정해둔 sql문에서는 ?를 매개변수처럼 사용할 수 있음.
		// ? -> 값만 가능, 컬럼명이나 테이블명은 ?로 데테할 수 없음
	
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setInt(1, 3);
		
		// ※ PreparedStatement의 executeQuery()는 인자가 없음.
		ResultSet rs = pst.executeQuery();
		
		rs.next();
		
		int a = rs.getInt(1);
		String name = rs.getString(2);
		System.out.println(a+" "+name);
		
		con.close();
		
		
	}
}
