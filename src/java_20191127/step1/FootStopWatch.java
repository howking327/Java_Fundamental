package java_20191127.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	
	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis();
		
		for(long i = 0; i < 5000000000l; i++){
			
		}
		f.endTime = System.currentTimeMillis();
		
		double elapsedTime = (double)(f.endTime - f.startTime) / 1000;
		
		System.out.printf("경과시간 : %.3f %n",elapsedTime);
	}
}
