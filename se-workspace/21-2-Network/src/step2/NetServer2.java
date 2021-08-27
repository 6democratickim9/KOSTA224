package step2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer2 {
	public void go() throws IOException{
		ServerSocket serverSocket= new ServerSocket(5432);
		System.out.println("�ݼ��� ���� ");
		Socket socket = serverSocket.accept();
		String clientIP = socket.getInetAddress().toString();
		System.out.println("*"+clientIP+" client ����");
		socket.close();
		serverSocket.close();
	}
	public static void main(String[] args) {
		NetServer2 server = new NetServer2();
		try {
			server.go();
			// TODO Auto-generated catch block
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

