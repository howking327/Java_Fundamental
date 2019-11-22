package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s , %d , %d , %.4f%n", str, a1, a2, d1);
		System.out.println(str + " , " + a1 + " , " + a2 + " , " + d1); // printf와
																		// println의
																		// 차이

		// 1부터 100까지 합을 구하는 코딩
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {// 짝수의 합인 경우 , 홀수면 나머지가 1로 설정
				sum += i;
			}
		}
		System.out.printf("1부터 100까지의 합은 %d 입니다.%n", sum);
		
		// 구구단
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n",first,second,first*second);
			}
		}
		
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n",first,second,first*second);
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i<=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
