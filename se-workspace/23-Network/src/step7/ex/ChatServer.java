package step7.ex;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	//client와 통신하는 객체(ServerWorker>socket)의 리스트를 관리
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() {
		
	}
	//각각의 서버워커가 클라부터 입력받은 메세지를 접속한 전체 클라이언트에게ㅔ출력하기 위한 메서드
	//아래 메서드를 개별 서버워커의 run 메서드에서 호출해 사용한다
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
