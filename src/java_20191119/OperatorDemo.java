package java_20191119;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		d = (double)b / a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a += b;
		
		int sum = 0;
		for(int i=1;i<=100;i++){
			//sum = sum + i;
			sum += i;
			
		}
		System.out.println(sum);
		
		a++;
		++a;
		a = 10;
		//증가 후 대입
		c = ++a;
		System.out.println(c);
		
		a = 10;
		//대입 후 증가
		c = a++;
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a>b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess); //그 외 비교연산자도 조건에 맞는 결과 도출
		
		// a && b => a가 false 면 b연산을 하지 않음
		// a || b => a가 true 면 b연산을 하지 않음
		// short circuit이 발생
		isSuccess = (a==b) && (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		isSuccess = (a==b) || (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
	}
}
