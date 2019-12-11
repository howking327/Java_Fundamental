package java_20191211;

import java.util.ArrayList;

import java_20191211.dao.EmpDao;
import java_20191211.dto.EmpDto;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		
		//dao.insert(new EmpDto(9002,"LEE","SALESMAN",7839,null,4998,0,20));
		//dao.update(new EmpDto(9002,"YEO","MANAGER",7839,null,4900,80,10));
		//dao.delete(9001);
		
		ArrayList<EmpDto> list = dao.select(0,5);
		for (EmpDto dto : list) {
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptNo = dto.getDeptNo();
			
			System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d, %n",no,name,job,mgr,hiredate,sal,comm,deptNo);
		}
		
		EmpDto dto = dao.select(9002);
		if(dto != null){
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptNo = dto.getDeptNo();
			
			System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d, %n",no,name,job,mgr,hiredate,sal,comm,deptNo);
		}else{
			System.out.println("해당 사원이 존재하지 않습니다.");
		}
	}
}
