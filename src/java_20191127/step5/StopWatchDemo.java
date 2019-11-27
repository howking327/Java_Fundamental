package java_20191127.step5;

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
