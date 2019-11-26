package java_20191126.step6;

public class StopMilliWatch extends StopWatch{
	private void start(){
		StopWatch s = new StopMicroWatch();
		s.setStartTime(System.currentTimeMillis());
	}
	private void stop(){
		StopWatch s = new StopMicroWatch();
		s.setEndTime(System.currentTimeMillis());
	}
	private double getElapsedTime(){
		StopWatch s = new StopMicroWatch();
		return (double)(s.getEndTime()-s.getStartTime())/1000;
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
