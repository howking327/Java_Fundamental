package java_20191127.step5;
//1. 실제 비지니스 로직을 해당 클래스에 추가하자
//2. 클래스들의 공통 요소가 있으면 부모 클래스로 만들어 보자
public class StopWatchDemo {
	public void execute(StopWatch s){
		s.run();
	}
	public static void main(String[] args) {
		StopWatchDemo swd = new StopWatchDemo();
		
		MilliWatch s1 = new MilliWatch();
		swd.execute(s1);
		
		MicroWatch s2 = new MicroWatch();
		swd.execute(s2);
		
		NanoWatch s3 = new NanoWatch();
		swd.execute(s3);
	}
}
