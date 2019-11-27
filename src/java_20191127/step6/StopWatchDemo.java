package java_20191127.step6;

public class StopWatchDemo {
	public void execute(StopWatch s){
		s.run();
	}
	public static void main(String[] args) throws Exception{
		StopWatchDemo swd = new StopWatchDemo();
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s = (StopWatch)Class.forName(className).newInstance();
		
		swd.execute(s);
	}
}
