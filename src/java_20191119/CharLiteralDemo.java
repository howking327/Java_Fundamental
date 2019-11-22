package java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//1. 유니코드 표현법 => '\u0000';
		char c1 = '\uC5EC';
		char c2 = '\uCC3D';
		char c3 = '\uD601';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2. 아스키코드 표현법
		// 48~57 은 숫자 0~9
		// 65~90 는 대문자 A~Z, 97~122 는 소문자 a~z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3. 문자 표현법 => ''
		char c5 = 'a';
		char c6 = '여';
		System.out.println(c5);
		System.out.println(c6);
		
		
		//4. escape char
		// \n => line feed
		// \t => tab
		// \\ => \
		// \' => '  , \" => "
		
		System.out.println("hello\n" + "world");
		System.out.println("hello\t" + "world");
		
		String path = "C:\\\"dev\"";
		System.out.println(path);
		
	}
}
