package step5.ex;

public class EchoClient {
	/*
	 *  ������ �����Ͽ� 
	 *  1.�ֿܼ��� �Է� (Scanner)  
	 *  2.������ ��� (PrintWriter) 
	 *  3.�ٽ� �������� ���� �޼����� �Է�(BufferedReader)�޾� �ֿܼ� ��� 
	 *  
	 *  1.2.3�� �ݺ� ( ���� ��� ���ڿ��� �ֿܼ� �Է��ϸ� Ŭ���̾�Ʈ ���α׷� ����ǵ��� �Ѵ� ) 
	 */
	public void go() {
		System.out.println("**EchoClient**");
	}
	public static void main(String[] args) {
		new EchoClient().go();
	}
}
