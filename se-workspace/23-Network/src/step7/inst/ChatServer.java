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
	//client�� ����ϴ� ��ü(ServerWorker>socket)�� ����Ʈ�� ����
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	public void go() throws IOException{
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ChatServer ����**");
			while(true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				//list�� �߰�
				list.add(serverWorker);
				Thread serverWorkerThread = new Thread(serverWorker);
				serverWorkerThread.start();
			}
			
		}finally {
			if(serverSocket!=null)
				serverSocket = close();
		}
		
	}
	//������ ������Ŀ�� Ŭ����� �Է¹��� �޼����� ������ ��ü Ŭ���̾�Ʈ���Ԥ�����ϱ� ���� �޼���
	//�Ʒ� �޼��带 ���� ������Ŀ�� run �޼��忡�� ȣ���� ����Ѵ�
		
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
					System.out.println(clientIp+"��� �� �����߻�"+e.getMessage());
				}
			finally {
				if(socket!=null) {
					try{
						socket.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					sendMessage(clientIp+"���� �����̽��ϴ�");
				}
			}
		}
		public void chatting() throws IOException{
			clientIp = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(),true);//autoflush
			sendMessage(clientIp+"���� �����ϼ̽��ϴ�");
			while(true) {
				String message = br.readLine();
				if(message==null||message.trim().equalsIgnoreCase("exit"))
					break;
				//������ ��� ����ڿ��� �޼����� ����Ѵ�
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
