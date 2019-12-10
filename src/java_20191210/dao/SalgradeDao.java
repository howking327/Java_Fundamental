package java_20191210.dao;

import java.util.ArrayList;

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
		return isSuccess;
	}
	
	public boolean update(SalgradeDto dto){
		boolean isSuccess = false;
		return isSuccess;
	}
	
	public boolean delete(int Grade){
		boolean isSuccess = false;
		return isSuccess;
	}
	
	public ArrayList<SalgradeDto> select(){
		ArrayList<SalgradeDto> list = null;
		return list;
	}
	
	public SalgradeDto select(int Grade){
		SalgradeDto dto = null;
		return dto;
	}
	
}
