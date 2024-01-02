package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 데이터베이스예제5 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int count =0 ;
		while(true) {
			if(s.equals("end")) break;
			ResultSet rs = st.executeQuery("select count(*) from person");
			rs.next();
			int id = rs.getInt(1) + 1;
		
			StringTokenizer stn = new StringTokenizer(s);
			String name = stn.nextToken();
			String age = stn.nextToken();
			String height = stn.nextToken();
			String sql = String.format("insert into person values(%d, '%s', %s, %s)", id , name, age, height);
			st.executeUpdate(sql);
			
			s = in.nextLine();
			count++;
		}
		
		st.execute("commit");
		
		in.close();
		con.close();
		System.out.println(count+"행이 추가되었습니다.");
	}

}
