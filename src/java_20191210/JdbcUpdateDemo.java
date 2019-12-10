package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로드 완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12","acorn12");
			
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			//sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?");
			//연결된 문장일 경우 끝나지 않았으면 공백을 남겨주어야 한다.
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, "MINING");
			pstmt.setString(2, "SILICON");
			pstmt.setInt(3, 60);
			
			int result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // user,password)
	}
}
