package homework;

public class Homework2 {
	public static void main(String[] args) {
		//문자 reverse 하기
		//1. input "abcd" => "dcba"
		String input = "abcd"; 
		char[] ch = input.toCharArray(); //배열생성
			//Bouble sort법으로 반대편 값과 Switch
			for (int i = 0; i < ch.length/2; i++) { 
				char ap = ch[i];
				ch[i] = ch[ch.length-1-i];
				ch[ch.length-1-i] = ap;
			}
			System.out.println(new String(ch));
			System.out.println();
			
			
			//2. input "abcde => "edcba"
		input = "abcde"; 
		char[] chs = input.toCharArray();
			for (int i = 0; i < chs.length/2; i++) { //배열의 길이가 홀수여도 가운데 값은 reverse시 변경되지 않으므로 같은 조건
				char aps = chs[i];
				chs[i] = chs[chs.length-1-i];
				chs[chs.length-1-i] = aps;
			}
			System.out.println(new String(chs));
			System.out.println();
	
		//prime number(소수) 구하기 , 1~100까지
		for (int i = 2; i <= 100; i++) {
			int num = 0; 
			for (int j = 2; j <= i; j++) { //int j = 2; j < i; j++
				if(i%j == 0 && i!=j){	//i%j == 0
					//num++
					break; //1과 자기 자신외에 다른 약수 발생시 바로 빠져나오도록 함
				//else if가 필요없다
				}else if(i%j == 0 && i ==j){ 
					num+=1;
				}
				if(num == 1){ //num == 0
					System.out.print(i + " ");
				}
			}	
		}
	}
}
