package java_20191126.step2;

public class StopWatch {
	long startTime;
	long endTime;
	long startNanoTime;
	long endNanoTime;
	
	//밀리세컨드
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/1000;
	}
	
	//나노세컨드
	public void startNano(){
		startNanoTime = System.nanoTime();
	}
	public void stopNano(){
		endNanoTime = System.nanoTime();
	}
	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/1000000000;
	}
}
