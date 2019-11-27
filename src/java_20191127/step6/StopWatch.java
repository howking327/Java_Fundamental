package java_20191127.step6;

public abstract class StopWatch {
	private long startTime;
	private long endTime;
	public abstract void run();
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
}
