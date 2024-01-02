package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class 데이터베이스예제11 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		Calendar ca = Calendar.getInstance();
		int now =ca.get(Calendar.YEAR);
		String sql = "select id, age from person";
		ResultSet rs = st.executeQuery(sql);
		Random r = new Random();
		
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ArrayList<Integer> years = new ArrayList<Integer>();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			int year = now - rs.getInt(2);
			ids.add(id);
			years.add(year);
		}
			
		for(int i=0; i<ids.size(); i++) {
			int id = ids.get(i);
			int year = years.get(i);
			int month = r.nextInt(1,13);
			ca.set(year, month-1, 1);
			int max = ca.getActualMaximum(Calendar.DAY_OF_MONTH);
			int day = r.nextInt(1, max+1);
			
			String s = String.format("%04d-%02d-%02d", year,month,day);
			sql = "update person set birthday = to_date('"+s+"','yyyy-mm-dd') where id="+id;
			st.executeUpdate(sql);
		}
		st.execute("commit");
		System.out.println("생일 추가완료");
		con.close();
	}
}
