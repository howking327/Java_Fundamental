package java_20191122;

public class Customer {
	public static void main(String[] args) {
		CustomerDemo c1 = new CustomerDemo();
		c1.name = "여창혁";
		c1.email = "howking327@gmail.com";
		System.out.println(c1.name + " , " + c1.email);
		
		CustomerDemo c2 = new CustomerDemo();
		c2.name = "손정의";
		c2.email = "masayosi@yahoo.co.jp";
		System.out.println(c2.name + " , " + c2.email);

		CustomerDemo c3 = new CustomerDemo();
		c3.name = "베조스";
		c3.email = "ceo@amazon.com";
		System.out.println(c3.name + " , " + c3.email);
		
		CustomerDemo c4 = c3;
		c4.name = "잡스";
		System.out.println(c3.name + " , " + c3.email);
		
		//c2의 내용을 그대로 가져와도 new 로 새로운 객체를 생성했기 때문에 비교결과 false가 나온다
		CustomerDemo c5 = new CustomerDemo();
		c5.name = "손정의";
		c5.email = "masayosi@yahoo.co.jp";
		System.out.println(c2==c5);//레퍼런스이기 때문에 값을 비교하는 것이 아니라 같은 객체를 참조하는지를 판단

		//static변수는 레퍼런스로 부르는 것이 아닌 클래스 이름으로 불러내는 것이 바람직하다
		//c1.interestRate (X)
		CustomerDemo.interestRate = 10.2;
		System.out.println(CustomerDemo.interestRate); 
		
		//CustomerDemo.BANKNAME= "국민은행"; //final 변수는 수정 불가능
	}
}
