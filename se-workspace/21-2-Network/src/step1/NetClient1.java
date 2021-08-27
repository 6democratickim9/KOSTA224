package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		String ip = "127.0.0.1";
		Socket socket = new Socket(ip,5432);
		System.out.println("CLI 접속");
		//InputStreamReader: 8bit 스트림을 16bit 스트림으로(문자스트림) 변환
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("서버가 출력한 메세지"+message);
		br.close();
		socket.close();
		System.out.println("**NetClient 종료**");
	}
	public static void main(String[] args) {
		NetClient1 client = new NetClient1();
		try {
			client.go();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
}
