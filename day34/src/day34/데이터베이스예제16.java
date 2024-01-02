package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class 데이터베이스예제16 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:localhost:1522:xe";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming","11111");
		
		String sql = "select * from fr1";
		
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		ArrayList<Integer> price = new ArrayList<Integer>();
		
		while(rs.next()) {
			id.add(rs.getInt("id"));
			name.add(rs.getString("name"));
			quantity.add(rs.getInt("quantity"));
			price.add(rs.getInt("price"));
		}
		
		sql = "insert into fruit (id,name,quantity,price) values(?,?,?,?)";
		pst = con.prepareStatement(sql);
		
		int count = 0;
		for(int i=0; i < id.size(); i++) {
			pst.setInt(1, id.get(i));
			pst.setString(2, name.get(i));
			pst.setInt(3, quantity.get(i));
			pst.setInt(4, price.get(i));
			int row = pst.executeUpdate();
			count +=row;
		}
		
		System.out.println(count+"행 추가완료");
		con.close();
		
	}
}
