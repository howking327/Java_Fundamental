package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.DeptDto;
import java_20191210.dto.SalgradeDto;

public class SalgradeDao {
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static SalgradeDao single;
	
	private SalgradeDao() {}
	
	public static SalgradeDao getInstance(){
		if(single == null){
			single = new SalgradeDao();
		}
		return single;
	}
	
	public boolean insert(SalgradeDto dto){
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12", "acorn12"); // user,password

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO salgrade(GRADE,LOSAL,HISAL) VALUES (?,?,?)"); 
			
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, dto.getGrade());
			pstmt.setInt(++index, dto.getLo());
			pstmt.setInt(++index, dto.getHi());

			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	
	public boolean update(SalgradeDto dto){
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12","acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE salgrade ");
			sql.append("SET LOSAL = ?, HISAL = ? ");
			sql.append("WHERE GRADE = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, dto.getLo());
			pstmt.setInt(++index, dto.getHi());
			pstmt.setInt(++index, dto.getGrade());
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
	}
	
	public boolean delete(int salGrade){
		boolean isSuccess = false;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12","acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM salgrade WHERE GRADE = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, salGrade);
			
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return isSuccess;
	}
	
	public ArrayList<SalgradeDto> select(){
		ArrayList<SalgradeDto> list = new ArrayList<SalgradeDto>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12","acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT GRADE, LOSAL, HISAL ");
			sql.append("FROM salgrade ");
			sql.append("ORDER BY GRADE");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int index = 0;
				int GRADE = rs.getInt(++index);
				int LOSAL = rs.getInt(++index);
				int HISAL = rs.getInt(++index);
				list.add(new SalgradeDto(GRADE,LOSAL,HISAL));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}
	
	public SalgradeDto select(int salGrade){
		SalgradeDto dto = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/acorn?autoReconnect=true",
					"acorn12","acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT GRADE, LOSAL, HISAL ");
			sql.append("FROM salgrade ");
			sql.append("WHERE GRADE = ?");
			
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index,salGrade);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				index = 0;
				int GRADE = rs.getInt(++index);
				int LOSAL = rs.getInt(++index);
				int HISAL = rs.getInt(++index);
				dto = new SalgradeDto(GRADE,LOSAL,HISAL);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return dto;
	}
	
}
