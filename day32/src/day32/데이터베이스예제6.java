package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class 데이터베이스예제6 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select name from person order by name");

		LinkedList<String> ll = new LinkedList<String>();

		while (rs.next()) {
			ll.add(rs.getString(1));
		}

		System.out.println("총 " + ll.size() + "명");

		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i));
			if (i < ll.size() - 1)
				System.out.print(", ");

		}

		con.close();
	}
}
