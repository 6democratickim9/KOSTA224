package step7.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import step7.inst.sendMessage.ServerWorker;

public class ChatServer {
	//client와 통신하는 객체(ServerWorker>socket)의 리스트를 관리
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException{
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ChatServer 실행**");
			while(true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				//list에 추가
				list.add(serverWorker);
				Thread serverWorkerThread = new Thread(serverWorker);
				serverWorkerThread.start();
			}
			
		}finally {
			if(serverSocket!=null)
				serverSocket = close();
		}
		
	}
	//각각의 서버워커가 클라부터 입력받은 메세지를 접속한 전체 클라이언트에게ㅔ출력하기 위한 메서드
	//아래 메서드를 개별 서버워커의 run 메서드에서 호출해 사용한다
		
	}
	
	//ServerSocket/loop/accept/ServerWorker/Thread/start()
	public class sendMessage(String message) {
		for(int i =0;i<list.size();i++ ) {
			list.get(i).pw.println(message);
		}
	}
	
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
			clientIp = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			try{
				chatting();
				}catch(IOException e){
					e.printStackTrace();
					System.out.println(clientIp+"통신 중 오류발생"+e.getMessage());
				}
			finally {
				if(socket!=null) {
					try{
						socket.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					sendMessage(clientIp+"님이 나가셨습니다");
				}
			}
		}
		public void chatting() throws IOException{
			clientIp = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);//autoflush
			sendMessage(clientIp+"님이 입장하셨습니다");
			while(true) {
				String message = br.readLine();
				if(message==null||message.trim().equalsIgnoreCase("exit"))
					break;
				//접속한 모든 사용자에게 메세지를 출력한다
				sendMessage(clientIp+":"+message);
			}//while
			
		}//chatting method
	}//ServerWorker class
	public static void main(String[] args) {
		try{
			new ChatServer().go();
		}catch(IOException e) {
			e.printStackTrace();
			
	}

}
