package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		ServerSocket serverSocket = new ServerSocket(5432);
		System.out.println("**NetServer1 ����**");
		//ServerSocket�� accept(): Ŭ���̾�Ʈ ������ ����ϴٰ� �����ϸ� �� Ŭ���̾�Ʈ�� ����� �Ϲݼ����� ��ȯ
		Socket socket = serverSocket.accept();//Ŭ���̾�Ʈ ������ ���
		System.out.println("**client�� ������**");
		//�������� ������ Ŭ���̾�Ʈ�� �޼����� ����Ѵ�
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("��ſ� ����� �����Դϴ�");
		out.close();
		socket.close();
		serverSocket.close();
		System.out.println("NetServer Ŭ���̾�Ʈ���� �޼��� ��� �� ����");
	}
	public static void main(String[] args) {b
		NetServer1 server = new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

