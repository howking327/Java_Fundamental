package java_20191121;

public class ArrayDemo {
	public static void main(String[] args) {
		//1. 배열 선언
		int[] a = new int[4];
		
		//2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		
		//3. 배열의 출력
		//length = 배열의 길이 , length() = 문자열의 길이
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//4. 배열의 생성과 할당을 동시에 설정
		int[] b = {1,2,3,4}; //int[] b = new int[]{1,2,3,4};
		//배열값 재할당 가능
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;
		
		//enhanced for loop
		for(int temp : b){
			System.out.println(temp);
		}
	}
}
