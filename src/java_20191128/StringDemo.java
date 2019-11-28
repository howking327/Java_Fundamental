package java_20191128;

public class StringDemo {
	public static void main(String[] args) {
		String str = "abcdefg";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		String ssn = "111111-1111118";
			System.out.println(ssn.charAt(7));
		
		str = str.concat("abcd");//str + "abcd"
		System.out.println(str);
		
		String fileName = "abc.zip";
		if(fileName.endsWith("zip")){
			System.out.println("zip 파일입니다");
		}else if(fileName.endsWith("ppt")){
			System.out.println("ppt 파일입니다");
		}
		
		String uri = "artist/index.jsp";
		if(uri.startsWith("artist")){
			System.out.println("작가 페이지입니다");
		}else if(uri.startsWith("exhibition")){
			System.out.println("전시 페이지입니다");
		}
		
		System.out.println("abc".equalsIgnoreCase("aBC"));//대소문자 구분없이 문자열 비교
		
		String s1 = "a";
		String s2 = "성";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		
		System.out.println(ssn.indexOf("-"));
		
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));
		
		String first = ssn.substring(0,6); //6대신 ssn.indexOf("-")로도 가능하다
		String second = ssn.substring(7); //7대신 ssn.indexOf("-") + 1로도 가능하다
		System.out.println(first);
		System.out.println(second);
		
		//java 상에서 줄바꿈 코드인 \n은 HTML에서 인식하지 못하므로 <br>코드로 변경해준다
		String content = "abc\nabc\nabc\nabc"; 
		content = content.replace("\n", "<br>");
		
		s1 = "abc";
		s2 = "abc ";
		//공백은 밑에 어떤 수식으로도 잡아내지 못한다.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//때문에 length로 길이의 차이를 확인하거나 trim()수식으로 공백을 제거하는 조건을 달아주어야 한다
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.trim().equals(s2.trim()));
		
		s1 = String.valueOf(100); //boolean이나 int등의 값을 String 문자열로 바꿔준다
		
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		for (String string : temp) {
			System.out.println(string);
		}
		
		//java_6.pdf 19page 기능 연습
		str = String.format("%3$,10.2f %2$,10.2f %1$,10.2f", 10000.234,20000.456,30000.789);
		System.out.println(str);
		
		//출력코드_ 둘 다 사용가능
		System.out.printf("%d%n",100);
		System.out.format("%d%n",100);
	}
}
