package java_20191127.step4;

public class MilliWatch {
	long startTime;
	long endTime;
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();		
	}
	public double getElapsedTime(){
		return (double)(endTime - startTime) / 1000;
	}
}
