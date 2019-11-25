package java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	public void m1(){
		name = "yeo"; //instance메서드에서는 static변수 사용 가능
		age = 25; //instance변수도 사용 가능
		m2(); //instance메서드도 호출 가능
		m4(); //static메서드도 호출 가능
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
	public static void m3(){
		name = "yeo"; //static메서드에서는 static변수 사용 가능
		//age = 25; //instance변수는 사용 불가
		//m2(); //instance메서드 역시 호출 불가
		m4(); //static메서드는 호출 가능
		StaticDemo sd = new StaticDemo();
		sd.age = 25;
		sd.m2();
	}
	public static void m4(){
		System.out.println("static method m4()");
	}
}
