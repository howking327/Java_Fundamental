package java_20191204;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScanDemo {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for (int i = 1; i < 65536; i++) {
			try {
				//ServerSocket 클래스는 해당 서버의 port번호를 사용할 수 있으면
				//ServerSocket 객체를 사용할 수 없고, 그렇지 않으면 예외 발생
				//즉, 예외가 발생한다는 것은 해당 port를 사용한다는 의미이다
				serverSocket = new ServerSocket(i);
				//System.out.println(i+"번호를 사용할 수 있습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(i+"번호를 사용할 수 없습니다.");
			}
		}
	}
}
