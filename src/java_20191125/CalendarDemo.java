package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	int temp;
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	public int getTotalCount(){
		temp = (year - 1) * 365;
		for (int i = 1; i < year; i++){ 
			if((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)){
				temp++;	
			}
		}
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
			monthArray[1] = 29;	
		}
		int sum = 0;
		int[] some = new int[month-1]; 
			System.arraycopy(monthArray, 0, some, 0, month-1); 
		for (int j = 0; j < some.length; j++) {
			sum += some[j];	
		}	
		sum += day; 
		temp += sum;
		
		return temp;
	}
	public void print(){
		String message = null;
		switch(temp%7){
		case 0 : message = "일요일"; break;
		case 1 : message = "월요일"; break;
		case 2 : message = "화요일"; break;
		case 3 : message = "수요일"; break;
		case 4 : message = "목요일"; break;
		case 5 : message = "금요일"; break;
		case 6 : message = "토요일"; break;
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.", year, month , day , message );
	}
	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.set(2019,12,25);
		c.getTotalCount();
		c.print();
	}
}
