package step3.inst;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class NetClient3 {
	public void go() throws UnknownHostException,IOException{
		Scanner scanner = new Scanner(System.in);
		Socket socket = new Socket(IP.INST,5432);
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		System.out.println("서버에 보낼 메세지: ");
		String message = scanner.nextLine();
		out.println(message);
		System.out.println("서버로 메세지전송");
		out.close();
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new NetClient3().go();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
