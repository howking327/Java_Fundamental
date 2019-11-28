package java_20191128;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list;
	
	public MemberManagementDemo(){
		list= new ArrayList<Member>();
	}
	
	public void print(){
		System.out.println("********************************************");
		System.out.println("*1)insert 2)update 3)delete 4)search 5)exit*");
		System.out.println("********************************************");
	}
	
	public String console(String msg){
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public void run(String index){
		if(index.equals("1")){
			insert();
		}else if(index.equals("2")){
			update();
		}else if(index.equals("3")){
			delete();
		}else if(index.equals("4")){
			search();
		}else if(index.equals("5")){
			System.out.println("프로그램이 종료되었습니다.");
		}else{
			System.out.println("미치셨습니까 휴먼?");
		}
	}
	//1. 아이디를 입력받는다.
	//2. 이름을 입력받는다.
	//3. ArrayList에 멤버를 추가한다.
	//4. print() 메서드를 호출하여 선택할 수 있게한다.
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기 한다.
	//6. 번호를 입력 받으면 run()메서드를 호출한다.
	public void insert(){
		String id = console("아이디>");
		String name = console("이름>");
		
		Member m = new Member(id,name);
		list.add(m);
		
		System.out.println("정상적으로 등록되었습니다.");
		
		print();
		String index = console("번호를 선택하세요>");
		run(index);
	}
	//1. 수정할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버 중에서 수정할 아이디를 찾아서 존재하면 수정하게 함(이름도 마찬가지)
	//3. 없으면 수정할 아이디가 없습니다. 등의 메시지를 출력한다.
	//4. ArrayList에 있는 멤버정보를 모두 출력한다.
	//5. print() 메서드를 호출하여 선택할 수 있게한다.
	//6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기 한다.
	//7. 번호를 입력 받으면 run()메서드를 호출한다.
	public void update(){
		
	}
	//1. 삭제할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버 중에서 삭제할 아이디를 찾아서 존재하면 삭제하게 함
	//3. 없으면 삭제할 아이디가 없습니다. 등의 메시지를 출력한다.
	//4. ArrayList에 있는 멤버정보를 모두 출력한다.
	//5. print() 메서드를 호출하여 선택할 수 있게한다.
	//6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기 한다.
	//7. 번호를 입력 받으면 run()메서드를 호출한다.
	public void delete(){
			
	}
	//1. 검색할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버 중에서 검색할 아이디를 찾아서 존재하면 삭제하게 함
	//3. 없으면 검색된 결과가 없습니다. 등의 메시지를 출력한다.
	//4. print() 메서드를 호출하여 선택할 수 있게한다.
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기 한다.
	//6. 번호를 입력 받으면 run()메서드를 호출한다.
	public void search(){
		
	}
	
	
	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String index = m1.console("번호를 선택하세요>");
		m1.run(index);
	}
}
