package java_20191127.step3;

public class StopWatchDemo {
	public static void main(String[] args) {
		NanoWatch w = new NanoWatch();
		
		w.start();
		
		for(long i = 0; i < 5000000000l; i++){
			
		}
		
		w.stop();
		
		double elapsedTime = w.getElapsedNanoTime();
		
		System.out.printf("경과시간 : %.9f %n",elapsedTime);
	}
}
