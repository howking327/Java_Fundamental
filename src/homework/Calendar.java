package homework;

import java.util.Scanner;

public class Calendar {
	private static int year;
	private static int month;
	private static int day;
	private int tabdate;
	private int totalday;
	private int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	private String[] dayArray = {"일","월","화","수","목","금","토"};
	
	private boolean LeapYear(int year){
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
			monthArray[1] = 29;	
			return true;
		}
		return false;
	}
	//매개변수 3개짜리 생성자
	public Calendar(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		printday();
	}
		
	//매개변수 2개짜리 생성자
	public Calendar(int year, int month){
		this(year, month, 0);
		printmonth();
	}
		
	//매개변수 1개짜리 생성자
	public Calendar(int year){
		this(year, 0, 0);
		printyear();
	}
	
	public void printyear(){
		for (int i = 0; i < monthArray.length; i++) {
			System.out.printf("%d월%n", i+1);
			printmonth();
		}
	}
	
	public void printmonth(){
		for (int i = 0; i < dayArray.length; i++) {
			System.out.printf("%s\t", dayArray[i]);
		}
		System.out.println();
		for (int d = 0; d <= tabdate; d++) {
            System.out.printf("\t");
		}   
		for (int j = 1; j <= monthArray[month-1]; j++) {
			if((j + totalday)%7==0 && j > 2){
				System.out.println();
			}
			System.out.print(j + "\t");
		}
		totalday += monthArray[month - 1];
        tabDate();
        System.out.println();
	}
	
	public void printday(){
		String message = null;
		switch(totalday%7){
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
	public void tabDate(){
		tabdate = totalday%7;
	}
	public int totalday(){
		LeapYear(year);
		totalday = (year - 1) * 365;
		for (int i = 1; i < year; i++){ 
			if((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)){
				totalday++;	
			}
		}
		int sum = 0;
		int[] some = new int[month-1]; 
			System.arraycopy(monthArray, 0, some, 0, month-1); 
		for (int j = 0; j < some.length; j++) {
			sum += some[j];	
		}	
		sum += day; 
		totalday += sum;
		
		return totalday;
	}
	
	public static void main(String[] args) {
		System.out.print("날짜를 입력하세요>");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();
 
	}   
}
