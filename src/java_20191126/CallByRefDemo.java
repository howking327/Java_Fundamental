package java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[] j){
		i = 20;
		j[3] = 400;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b[] = {1,2,3,4};
		
		System.out.println(a);
		System.out.println(b[3]);
		
		//a => call by value, b => call by reference
		CallByRefDemo.change(a,b); //같은 클래스 내에서는 CallByRefDemo. 생략이 가능
		
		System.out.println(a); //call by value, 메서드 호출 후 변화  없음
		System.out.println(b[3]);//call by reference, 메서드 호출 후 변화 있음
		
		//배열 선언의 차이점
		int[] c; //c배열의 객체 생성이 이뤄지지 않음 즉, 메모리에 할당이 안됨
		c = new int[4]; //때문에 왼쪽과 같이 배열을 생성하지 않고 S.o.p.를 하게 되면 오류가 난다
		
		int[] d = null; //d배열을 null값으로 생성하여 메모리 할당 후 객체 생성
		d = new int[4]; //이 경우는 S.o.p.를 하면 null값이 나온다. 
		//따라서 어떠한 로컬 변수를 선언할 경우에는 c의 경우가 아닌 d의 경우처럼 각 값에 따라 초기값을 설정해주는 것이 좋다.
		// ex) int -> 0 , boolean -> false , char -> \u0000 등  pdf java-3 25p 참고
	}
}
