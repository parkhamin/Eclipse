package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 오라클 DBMS와 연결하기 위해서 jdbc을 프로젝트에 추가
// ojdbc11.jar 파일을 프로젝트 폴더로 복사
// ojdbc11.jar를 빌드에 추가

public class 데이터베이스1 {
	public static void main(String[] args) {
		// 연결한 DBMS url(경로)
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String user = "c##haming";
		String password = "11111";

		Connection con = null; // DB에 접속하는 클래스
		Statement st = null; // SQL문을 실행할 인터페이스
		ResultSet rs = null; // SQL문의 실행 결과를 지정할 인터페이스

		try {
			// 오라클 드라이버를 찾는 코드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB에 계정과 비밀번호로 connect
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결성공");
			
			st = con.createStatement(); // SQL문을 작성할 상태 생성
			
			String sql = "select * from book";
			
			// select문(쿼리)을 실행하고 결과(테이블)를 ResultSet에 저장
			rs = st.executeQuery(sql);
			
			rs.next(); // 테이블에서 한 행을 가져옴
			int bookid = rs.getInt(1); // 열의 데이터가 NUMBER타입이면 getInt(열번호)
			String bookname = rs.getString(2); // VARCHAR2이면 getString(열번호)
			String publisher = rs.getString(3);
			int price = rs.getShort(4);
			
			System.out.println(bookid+" "+bookname+" "+publisher+" "+price);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}