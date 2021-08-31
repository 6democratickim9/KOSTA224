package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer3 {

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("*NetServer3 ����*");
			int count =1;
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIP = socket.getInetAddress().toString();
				System.out.println(clientIP+"�� ����");
				BufferedReader br = null;
				try {
					br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String message = br.readLine();
					System.out.println(count+"��° Ŭ���̾�Ʈ"+clientIP+"���� �޼���"+message);
					count++;
				}
				
				br.close();
				socket.close();
			}
			catch(Exception e) {
				System.out.println(clientIp+"�� ��� �� ���ܹ߻�"+e.getMessage());
			
			}finally {
			if(serverSocket!=null) {
				serverSocket.close();
			}
		}
		
	}
	public static void main(String[] args) {
		try{
			new NetServer3().go();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
