package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class 데이터베이스예제18 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "c##haming", "11111");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from book");
		
		ResultSetMetaData rm = rs.getMetaData();
		
		int c = rm.getColumnCount();
		String[] cnames = new String[c];
		
		//int lines = 0;
		
		for ( int i = 0,index = 1 ; i < c ; i++,index++ ) { 
			cnames[i] = rm.getColumnName(index);
			//lines += rm.getColumnDisplaySize(index);
		}
		
		
		for ( int i = 0 ; i < cnames.length ; i++ ) 
			System.out.printf("%10s",cnames[i]);
		
		System.out.println();
		for ( int i = 0 ; i < 50 ; i++ )
			System.out.print("-");
		
		System.out.println();
		
		String[] arr = new String[c];
		
		while( rs.next() ) {
			for ( int i = 0, index = 1; i < arr.length ; i++,index++ ) {
				String a = rm.getColumnTypeName(index);
				if ( a.contains("NUMBER"))
					arr[i] = rs.getInt( index )+"";
				if ( a.contains("VARCHAR2") )
					arr[i] = rs.getString( index );
				System.out.printf("%15s", arr[i]);
			}
			System.out.println();
		}
		con.close();
	}
}
