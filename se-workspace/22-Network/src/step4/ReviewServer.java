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
				//대기하다 클라이언트가 접속하면 동작한다
				//리턴된느 Socket은 개별 클라이언트와 대화할 상담원전화기
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString();
				System.out.println(clientIp+"님 접속");
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				out.println(clientIp+"님 즐거운 금요일")
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
