package java_20191210;

import java.util.ArrayList;

import java_20191210.dao.SalgradeDao;
import java_20191210.dto.DeptDto;
import java_20191210.dto.SalgradeDto;

public class SalgradeDemo {
	public static void main(String[] args) {
		SalgradeDao s = SalgradeDao.getInstance();
		
		//boolean isSuccess = s.insert(new SalgradeDto(7,1200,3020));
		//System.out.println(isSuccess);
		
		//boolean isSuccess = s.update(new SalgradeDto(6,720,1080));
		//System.out.println(isSuccess);
	
		//boolean isSuccess = s.delete(6);
		//System.out.println(isSuccess);
		
		ArrayList<SalgradeDto> list = s.select();
		for (SalgradeDto dto : list) {
			System.out.printf("%d , %d , %d %n",dto.getGrade(),dto.getLo(),dto.getHi());
		}
		
		SalgradeDto dto = s.select(1);
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
		}else{
			System.out.printf("%d , %d , %d %n",dto.getGrade(),dto.getLo(),dto.getHi());
		}
	}
}
