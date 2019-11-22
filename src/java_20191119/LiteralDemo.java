package java_20191119;

public class LiteralDemo {
	public static void main(String[] args){
		//byte의 할당량을 넘어가면 overflow 발생
		//byte b1 = 128;
		
		int a1 = 128;
		int a2 = 076; //0 = 8진수 코드
		int a3 = 0x123; //0x = 16진수 코드
		int a4 = 0b10101;//0b = 2진수 코드
		
		System.out.println(a1); //10진수
		System.out.println(a2); //8진수
		System.out.println(a3); //16진수
		System.out.println(a4); //2진수
		
		//long 레터럴은 숫자 뒤에 l 도는 L로 표기
		long l1 = 2200000l;
		
		//float 레터럴은 소수점 뒤에 f 또는 F로 표기
		float f1 = 123.43f;
		
		//double 레터럴은 소수점 뒤에 d 또는 D로 표기, 생략도 가능
		double d1 = 1234.56;
		
		//boolean 레터럴은 true or false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0;
		//prinitive data type의 == 연산자는 값만 비교함
		System.out.println(a1==d1);
		
		int first = 10;
		int second = first;
		first = 20;
		System.out.println(first);
		System.out.println(second);
		
	}
}
