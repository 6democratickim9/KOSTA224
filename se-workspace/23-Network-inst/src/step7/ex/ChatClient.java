package step7.ex;

import java.io.BufferedReader;
import java.net.Socket;

public class ChatClient {
	private Socket socket;
	
	/*
	 *  Socket ���� 
	 *  ReceiverWorker ���� , Thread ���� , setDaemon(true) , start() 
	 *  �ַܼκ��� �Է¹��� (Scanner) �޼����� ������ ����ϴ� ����� ���� 
	 *  ( exit �� �Է��ϸ� ���� ) 
	 */
	public void go() {
		
	}
	//nested class 
	public class ReceiverWorker implements Runnable{
		
		//�������� ģ������ �޼����� �Է¹޾� �ֿܼ� ����Ѵ� 
		@Override
		public void run() {
			
		}		
		public void receiveMessage() {}
	}
	public static void main(String[] args) {
		new ChatClient().go();
	}
}



