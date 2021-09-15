package step7.ex;

import java.io.BufferedReader;
import java.net.Socket;

public class ChatClient {
	private Socket socket;
	
	/*
	 *  Socket 생성 
	 *  ReceiverWorker 생성 , Thread 생성 , setDaemon(true) , start() 
	 *  콘솔로부터 입력받은 (Scanner) 메세지를 서버로 출력하는 기능을 구현 
	 *  ( exit 를 입력하면 종료 ) 
	 */
	public void go() {
		
	}
	//nested class 
	public class ReceiverWorker implements Runnable{
		
		//서버에서 친구들의 메세지를 입력받아 콘솔에 출력한다 
		@Override
		public void run() {
			
		}		
		public void receiveMessage() {}
	}
	public static void main(String[] args) {
		new ChatClient().go();
	}
}



