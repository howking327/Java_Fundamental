package java_20191126.step6;

public class PreStopWatchDemo {
	public static void execute(StopWatch s){
		s.run();
	}
	public static void main(String[] args) {
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
		StopNanoWatch s2 = new StopNanoWatch();
		execute(s2);
		
		StopMicroWatch s3 = new StopMicroWatch();
		execute(s3);

	}
}
