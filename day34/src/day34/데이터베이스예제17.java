package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class 데이터베이스예제17 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming", "11111");
		Statement st =con.createStatement();
		ResultSet rs = st.executeQuery("select * from person");
		ResultSetMetaData rm = rs.getMetaData();
		
		System.out.printf("%10s %10s %15s\n", "Name","Null","Type");
		
		int column = rm.getColumnCount();
		
		for(int i=0, a=1; i<column; i++, a++) {
			String name = rm.getColumnLabel(a);
			String notnull = rm.isNullable(a) == 0 ? "NOT NULL" : " ";
			String type = rm.getColumnTypeName(a);
			String p = rm.getPrecision(a)+"";
			int s = rm.getScale(a);
			String ps = (s==0) ? "": ","+s+"";
			
			if(p.equals("0")) {
				System.out.printf("%10s %10s %15s\n", name,notnull,type,p,ps);
			}else System.out.printf("%10s %10s %15s(%s%s)\n", name,notnull,type,p,ps);
		}
		con.close();
	}

}
