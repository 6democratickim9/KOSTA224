package step5.ex;

public class EchoServer {
	/*
	 * ������ Ŭ���̾�Ʈ�� ������ ��� ( 1 �� 1 ����̹Ƿ� accept() �ݺ� x ) 
	 * 1. ������ Ŭ���̾�Ʈ�� ���� �޼����� �Է¹޾� �ڽ��� �ֿܼ� ��� (BufferedReader)
	 * 2. �Է¹��� �޼����� �ٽ� Ŭ���̾�Ʈ�� ����Ѵ� ( *server*�� ���ڿ��� �߰� )
	 * 
	 * 1.2 �� �ݺ� 
	 * ( Ŭ���̾�Ʈ�� ���� ��� ���ڿ��� ������ ���� �ڽŵ� ���α׷��� �����Ѵ� ) 
	 */
	public void go() {
		System.out.println("**EchoServer**");
	}
	public static void main(String[] args) {
		new EchoServer().go();
	}
}
