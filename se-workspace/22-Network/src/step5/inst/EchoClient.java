package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.omg.CORBA.portable.UnknownException;

public class EchoClient {
	//������ �����Ͽ�
//	1.�ֿܼ� �Է�
//	2.������ �ⷫ
//	3.�ٽ� �������� ���� �޼����� �Է�
	public void go() throws UnknownException,IOException{
		Socket socket = null;
		Scanner scanner = null;
		PrintWriter out = null;
		BufferedReader br = null;
		
		
		try {
			socket = new Socket("127.0.0.1",5432);
			scanner = new Scanner(System.in);
			out = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("**EchoClient**");
			while(true) {
				System.out.println("������ ���� �޼���");
				String message= scanner.nextLine();
				out.println(message);
			}
		}finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
		
		
	}
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (UnknownException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
