package java_20191122.bb;
//서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야한다.
import java_20191122.aa.Notice;

public class NoticeDemo2 extends Notice { 
	public static void main(String[] args) {
		Notice n = new Notice();
		//Notice클래스의 접근을 했으나 public 이 아닌 나머지는 접근할 수 없다
		n.number = 10;
		//n.title = "title"; //protected
		//n.hit = 100; //default
		//n.regdate = "2019-11-22"; //private
		
		//Notice로부터 NoticeDemo2가 상속을 받았으므로 protected까지는 접근가능
		NoticeDemo2 nc = new NoticeDemo2();
		nc.number = 10;
		nc.title = "title";
		//nc.hit = 100; 
		//nc.regdate = "2019-11-22";
	}
}
