package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

// MetaData(메타데이터) -> 데이터의 데이터( 데이터가 가지는 기본적인 속성들)

public class 데이터베이스6 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming", "11111");
		Statement st =con.createStatement();
		ResultSet rs = st.executeQuery("select * from person");
		
		// ResultSet(테이블)의 속성들(열의 개수, 컬럼이름, ...)이 저장된 인터페이스
		ResultSetMetaData rm = rs.getMetaData();
		
		int column = rm.getColumnCount(); // 열의 개수를 리턴
		System.out.println(column);
		
		// getColumnLabel(열인덱스), getColumnName(열인덱스) -> 해당 열의 이름을 리턴
		String cname = rm.getColumnLabel(1);
		System.out.println(cname);
		cname = rm.getColumnName(2);
		System.out.println(cname);
		
		String ctype = rm.getColumnTypeName(1); // 컬럼의 데이터 타입을 리턴
		System.out.println(ctype);
		System.out.println(rm.getColumnTypeName(2));
		
		int p = rm.getPrecision(4); // 숫자나 문자열의 자리수 리턴
		System.out.println(p);
		
		int s = rm.getScale(4); // 소수점 자리수를 리턴
		System.out.println(s);
		
		System.out.println(rm.isNullable(1)); // not null이면 0을 리턴, null이면 1을 리턴
		System.out.println(rm.isNullable(2)); 
		System.out.println(rm.isNullable(3));
		
		System.out.println(rm.getColumnDisplaySize(4));
		
		con.close();
	}
}
