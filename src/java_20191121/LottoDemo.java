package java_20191121;

public class LottoDemo {
	public static void main(String[] args) {
		//Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double값을 반환
		int[] lotto = new int[6];
		
		
		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random();
			lotto[i] = (int)(random * 45) + 1;	//할당된 칸에 값을 일단 집어넣는다, 중복값이면 다른 값을 다시 집어넣는다
			
			//중복값을 체크만 하는 코딩, 넣어진 값이 중복인지 체크
			for (int j = 0; j < i; j++) {
				if(lotto[j]==lotto[i]){
					i--; //중복일 경우 해당 칸을 비우고 다음칸으로 넘어가는 것을 방지한다
					break;//중복이 발견된 경우 다음 값을 굳이 확인하지 않아도 되기 때문에 필요
				}
			}
		}
		//Bouble sort법을 이용한 오름차순 정렬 코드
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) { //실행 후 큰 값은 우측으로 이동되므로 다음 실행 시 비교 불필요
				if(lotto[j]>lotto[j+1]){
					int temp = lotto[j]; //왼쪽 값을 temp로 저장 후
					lotto[j] = lotto[j + 1]; //우측 값을 왼쪽 값으로 변경
					lotto[j + 1] = temp; //저장된 temp값을 우측 값으로 변경 - switch 코드
				}
			}
		}
		for (int i : lotto){
			System.out.print(i + "\t");
		}
	}
}
