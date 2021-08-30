package step7.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.copy.IP;

public class ChatClient implements IP{
	private Socket socket;
	private BufferedReader br;
	private Scanner scanner;
	private PrintWriter pw;
	public void go() throws UnknownHostException,IOException{
		try {
			socket = new Socket(IP.LOCAL,5432);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(),true);
			ReceiverWorker worker = new ReceiverWorker();
			Thread receiverThread = new Thread(worker);
			receiverThread.setDaemon(true);
			receiverThread.start();
			System.out.println("**ChatClient ½ÇÇà**");
			while(true) {
				String message = scanner.nextLine();
				pw.println(message);
				if(message.trim().equalsIgnoreCase("exit")){
					break;
				}
			}
		}finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
		
		//socket,Thread,setDaemon(true),start()
	}
	
	
	
	public class ReceiverWorker implements Runnable{

		@Override
		public void run() {
			try{
				receiveMessage();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void receiveMessage() throws IOException{
			while(true) { 
				String message = br.readLine();
				if(message==null)
					break;
				System.out.println(message);
			}
			
		}
		
	}
	public static void main(String[] args) {
		try{
			new ChatClient().go();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
