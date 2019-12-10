package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			//1. org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브 로드 완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//2. 데이터베이스와 연결을 시도한다.
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true", //url
					"acorn12","acorn12"); // user,password
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?, ?, ?)"); //?는 바인딩변수라 하는데 항상 값에만 적용가능하다.
			//3. SQL문을 전송할 수 있는 PreparedStatement객체를 생성한다.
			pstmt = con.prepareStatement(sql.toString());
			//4. 바인딩변수에 들어갈 값을 설정한다.
			pstmt.setInt(1, 60);
			pstmt.setString(2, "ANAYLSIS");
			pstmt.setString(3, "LA");
			
			//5. SQL문을 전송한다.
			int result = pstmt.executeUpdate();//insert, update, delete(DML)의 경우에는 .executeUpdate()를 사용한다.
			System.out.println("갱신된 행의 수 :" + result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
