package java_20191204;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for (int i = 22; i <= 1024; i++) { //443 = https:
			//Socket 객체가 생성되었다는 의미는 host, port로 통신이 가능하다는 의미
			//이는 해당 host에 port번호를 사용하고 있다는 얘기임
			
			try {
				socket = new Socket("13.209.180.253",i);
				System.out.println(i+ "번호를 사용하고 있습니다.");
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.err.println("호스트가 존재하지 않습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(i+ "번호를 사용하고 있지 않습니다.");
			}
		}
	}
}
