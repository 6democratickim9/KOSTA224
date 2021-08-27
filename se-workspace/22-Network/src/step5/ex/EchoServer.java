package step5.ex;

public class EchoServer {
	public void go() {
		System.out.println("**echo**");
	}
	public static void main(String[] args) {
		new EchoClient().go();
	}
}

