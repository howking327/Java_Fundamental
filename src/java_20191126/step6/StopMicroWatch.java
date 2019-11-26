package java_20191126.step6;

public class StopMicroWatch extends StopWatch{
	private void start(){
		StopWatch s = new StopMicroWatch();
		s.setStartTime(System.nanoTime());
	}
	private void stop(){
		StopWatch s = new StopMicroWatch();
		s.setEndTime(System.nanoTime());
	}
	private double getElapsedTime(){
		StopWatch s = new StopMicroWatch();
		return (double)(s.getEndTime()-s.getStartTime())/1000000000;
	}
	public void run(){
		start();
		for (long i = 0; i < 5000000000l; i++) {
				
		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.6f", elapsedTime);
	}
}
