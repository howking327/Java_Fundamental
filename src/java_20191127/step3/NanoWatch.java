package java_20191127.step3;

public class NanoWatch {
	long startTime;
	long endTime;
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();		
	}
	public double getElapsedNanoTime(){
		return (double)(endTime - startTime) / 1000000000;
	}
}
