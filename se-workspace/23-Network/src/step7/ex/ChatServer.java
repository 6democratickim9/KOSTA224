package step7.ex;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	//client�� ����ϴ� ��ü(ServerWorker>socket)�� ����Ʈ�� ����
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() {
		
	}
	//������ ������Ŀ�� Ŭ����� �Է¹��� �޼����� ������ ��ü Ŭ���̾�Ʈ���Ԥ�����ϱ� ���� �޼���
	//�Ʒ� �޼��带 ���� ������Ŀ�� run �޼��忡�� ȣ���� ����Ѵ�
	public void sendMessage(String message) {
		
	}
	
	//ServerSocket/loop/accept/ServerWorker/Thread/start()
	
	public class ServerWorker implements Runnable{
		private Socket socket;
		private String clientIp;
		private BufferedReader br;
		private PrintWriter pw;
		
		
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		public void receiveMessage() {
			
		}
	}
	public static void main(String[] args) {
		new ChatServer().go();
	}

}
