package java_20191127.step5;

public class NanoWatch extends StopWatch{
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();		
	}
	public double getElapsedTime(){
		return (double)(endTime - startTime) / 1000000000;
	}
	
	public void run(){
		start();
		for(long i = 0; i < 5000000000l; i++){
			
		}
		stop();
		double elapsedTime = getElapsedTime();
		
		System.out.printf("경과시간 : %.9f %n",elapsedTime);
	}
}
