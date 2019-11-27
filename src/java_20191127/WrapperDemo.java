package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//java 1.4 이전 버전에서는 primitive data type을 collection에
		//저장할 수 없었기 때문에 primitive data type을 객체화 할 수 있는
		//Wrapper class로 변환하여 저장해야 한다.
		//ArrayList list= new ArrayList();
		//list.add(new Integer(1));
		//list.add(new Integer(2));
		
		//Integer i1 = (Integer)list.get(0);
		//Integer i2 = (Integer)list.get(1);
		
		//int a = i1.intValue() + i2.intValue();
		
		//java 1.5 이후 버전
		ArrayList<Integer> list= new ArrayList<Integer>();
		//auto-boxing
		list.add(1);
		list.add(2);
		
		Integer i1 = list.get(0);
		Integer i2 = list.get(1);
		
		int a = i1 + i2; //auto-unboxing
		
		// String str = 10; 하면 생성안됨 String str = 10 + ""; 로도 가능하나 '저급'한 방법이다
		String str = String.valueOf(10);
		
		// int b = "100"; 하면 생성안됨 '문자열을 int로 바꿀 때'는 Wrapper class의 도움을 받아야함
		int b = Integer.parseInt("100");
	}
}
