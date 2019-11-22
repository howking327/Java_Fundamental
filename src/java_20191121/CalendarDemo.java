package java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 달력 만들기
		 1. 1년 1월 1일은 월요일
		 2. 1년 = 365일, 윤년 = 366일
		 3. 윤년은 4년마다 반복 그 중 100의 배수는 제외, 400의 배수는 다시 더한다(제외X)
		 4. 2019년 12월 25일은 무슨 요일일까요?
		 */
		int year = 2019;
		int month = 12;
		int day = 25;
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int temp = (year - 1) * 365;
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
		
		
		//연도 입력 시 달력만들기
		
	}
}
