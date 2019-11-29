package java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k,int e){
		int sum = k + e;
		double avg = (double)sum/2;
		return avg;
	}
	public static void main(String[] args) {
		try{
			int k = Integer.parseInt(args[0]);
			int e = Integer.parseInt(args[1]);
			double average = getAvg(k,e);
			System.out.printf("평균 : %.1f",average);
		}catch(NumberFormatException e){
			//e.printStackTrace(); 예외가 일어난 경로를 확인할 때
			//System.out.println(e.getMessage()); 예외가 일어난 이유를 확인할 때
			System.err.println("숫자를 넣어주세요.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("국어와 영어 점수를 모두 넣어 주세요");
		}
	}

}
