package java_20191127;

public interface InterA extends InterB, InterC{ //인터페이스끼리는 다중 상속 가능
	//인터페이스 변수는 public static final 생략 가능
	double PI = 3.14;
	//인터페이스에 접근한정자를 붙이지 않으면 public
	//abstract 생략 가능
	public abstract void mA();
	
}
