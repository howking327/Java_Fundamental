package java_20191204.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port){
		this.ip = ip;
		this.port = port;
	}
	
	public void run(){
		Socket socket = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			//3. socket 객체를 생성한다.
			//4. 서버와 연결을 한다.
			socket = new Socket(ip,port);
			//6. 소켓으로 출력스트림을 생성한다.
			out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			bw.write("이야 이거 신기하네");
			bw.newLine();
			bw.flush();
			
			//9. 소켓으로 입력스트림을 생성한다.
			in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(out != null) out.close();
					if(osw != null) osw.close();
					if(bw != null) bw.close();
					if(in != null) in.close();
					if(isr != null) isr.close();
					if(br != null) br.close();
					if(socket != null) socket.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		new EchoClient("192.168.0.209",3000).run();
	}
}
