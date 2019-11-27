package java_20191126.step6;

public class StopMilliWatch extends StopWatch{
	private void start(){
		//StopWatch s = new StopMicroWatch();
		setStartTime(System.currentTimeMillis());
	}
	private void stop(){
		setEndTime(System.currentTimeMillis());
	}
	private double getElapsedTime(){
		return (double)(getEndTime()-getStartTime())/1000;
	}
	public void run(){
		start();
		for (long i = 0; i < 5000000000l; i++) {
		
		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
