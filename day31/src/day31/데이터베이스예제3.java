package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class 데이터베이스예제3 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@127.0.0.1:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		Scanner in = new Scanner(System.in);

		System.out.print("id: ");
		int id = in.nextInt();
		System.out.println("name: ");
		String name = in.next();
		System.out.println("age: ");
		int age = in.nextInt();
		System.out.println("height: ");
		double height = in.nextDouble();
		
		String sql = String.format("insert into person values(%d, '%s', %d, %.1f)", id, name, age, height);

		//String sql1 = "update person set age = (age-10) where age>=30";
		int row = st.executeUpdate(sql); 
		// executeUpdate(sql문) -> 변경된 행의 갯수를 리턴함
		System.out.println(row+"행이 추가되었습니다.");

		in.close();
		con.close();
		

	}

}
