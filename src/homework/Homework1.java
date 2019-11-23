package homework;

public class Homework1 {
	public static void main(String[] args) {
		int year = 2019;
		int month = 12;
		int day = 25;
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int temp = (year - 1) * 365; // 입력년도는 1년이 아직 끝나지 않았으므로 year-1 해준다
		//윤달이 있는 년도 갯수에 맞춰 일수 추가 계산
		for (int i = 1; i < year; i++){ 
			if((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)){ //4의 배수 더하고 100의 배수는 제외, 400의 배수는 다시 더한다
				temp++;	
			}
		}
		//입력년도가 윤년일 경우 일수 추가
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
			monthArray[1] = 29;	
		}
		//입력년도 일수 계산 
		int sum = 0;
		int[] some = new int[month-1]; //입력 월과 같은 크기의 배열 생성
			System.arraycopy(monthArray, 0, some, 0, month-1); //생성한 배열에 입력 월까지의 일수 카피
		for (int j = 0; j < some.length; j++) {
			sum += some[j];	//입력 월 전월까지 배열 값 합산	
		}
		sum += day; //합산한 값에 입력 월의 일수 더하기
		temp += sum; //전년도까지의 전체 일수에 입력년도 일수 더하기
		
		String message = null;
		switch(temp%7){ //전체 일수를 7로 나눈 나머지에 따라 요일 계산
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
}