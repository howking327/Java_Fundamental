package java_20191126;
//import java.lang.*;
public class SubDemo extends Object{
	/*public SubDemo(){
							//alt+shift+s -> c 단축키로 숨어있는 클래스를 강제적으로 드러내게 할 수 있다
	}*/
	public static void main(String[] args){
		Sub s1 = new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");
		
		s1.money = 10000;
		s1.chicken = "교촌치킨 2마리";
	}
}
