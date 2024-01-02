package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 데이터베이스예제4 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String user = "apple";
		String password = "11111";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select max(id) from person");
		
		rs.next();
		int id = rs.getInt(1) + 1;
				
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		StringTokenizer stk = new StringTokenizer(s);
		
		String name = stk.nextToken();
		String age = stk.nextToken();
		String height = stk.nextToken();
		
		String sql = String.format("insert into person values(%d,'%s', %s, %s)", 
				id, name, age, height);
		
		int row = st.executeUpdate(sql);
		
		System.out.printf("\n %d행이 추가되었습니다.\n",row);
		
		st.execute("commit");
		
		con.close();
		in.close();
	}

}
