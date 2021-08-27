package step4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReviewServer {
	public void go() throws IOException {
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ReviewServer**");
			while(true) {
				//����ϴ� Ŭ���̾�Ʈ�� �����ϸ� �����Ѵ�
				//���ϵȴ� Socket�� ���� Ŭ���̾�Ʈ�� ��ȭ�� ������ȭ��
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp+"�� ����");
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				out.println(clientIp+"�� ��ſ� �ݿ���")
				socket.close();
			}
		}finally {
			if(serverSocket = null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new ReviewServer().go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
