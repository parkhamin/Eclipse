package day33;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

public class 데이터베이스예제12 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = null;
		
		String sql = "select name, birthday from person";
		
		rs= st.executeQuery(sql);
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> birthday = new ArrayList<String>();
		Calendar ca = Calendar.getInstance();
		
		while(rs.next()) {
			String s = rs.getString("name"); // .getString("컬럼이름")
			Date d = rs.getDate("birthday");
			
			ca.setTime(d);
			int year = ca.get(Calendar.YEAR);
			int month = ca.get(Calendar.MONTH) + 1;
			int day = ca.get(Calendar.DATE);
			String b = "일월화수목금토";
			String wd = b.charAt(ca.get(Calendar.DAY_OF_WEEK))+"요일";
			
			
			if(3<= month && month <= 5) {
				name.add(s);
				String a = String.format("%d년 %d월 %d일 %s",year,month,day,wd);
				birthday.add(a);
			}
		}
		
		for(int i=0; i<name.size(); i++) {
			System.out.println(name.get(i)+""+birthday.get(i));
		}
		
		con.close();
	}
}
