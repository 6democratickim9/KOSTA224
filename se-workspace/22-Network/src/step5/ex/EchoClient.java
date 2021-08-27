package step5.ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner; 
public class EchoClient {
	private Socket clientSocket; // Ŭ���̾�Ʈ ���� 
	private BufferedReader br; 
	// Ŭ���̾�Ʈ�κ��� ���޹��� �޽����� �о�帱 ���� �޸� 
	private PrintWriter pw;
	// Ŭ���̾�Ʈ�� �޽����� ���� 
	private Scanner sc;
	// ������ �Է� 
	public static void main(String[] args) {
		new EchoClient(); 
		} public EchoClient() {
			init(); 
			} public void init() {
				try { clientSocket = new Socket("127.0.0.1", 5432); 
				System.out.println("Server Connect"); 
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				// ������ ���� �����͸� �޾ƿ� �غ� 
				pw = new PrintWriter(clientSocket.getOutputStream());// ������ �����͸� ���� �غ� 
				sc = new Scanner(System.in);//�Է��� �����͸� ���� �غ� //
				System.out.println(""); String inputData = "";//�Է��� �����͸� ������ ���� 
				while(!inputData.equals("exit")) { System.out.print("to Server: "); 
				pw.println(sc.next());//���� ������ �о�ͼ� ������ ������
				pw.flush();//������ ������ �޸𸮸� �ʱ�ȭ ���Ѽ� ���ο� �ִ� �����͸� ������ �����Ѵ� 
				System.out.println("from Server: " + br.readLine()); //�������� ���� �����͸� ǥ���Ѵ�. 
				} clientSocket.close();
				//���� �����ϸ� ������ �ݴ´�. 
				} catch (IOException e) {
					e.printStackTrace(); 
				} 
				} 
			

	}
