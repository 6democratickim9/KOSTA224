package step5.ex;

public class EchoServer {
	/*
	 * 서버는 클라이언트의 접속을 대기 ( 1 대 1 통신이므로 accept() 반복 x ) 
	 * 1. 서버는 클라이언트가 보낸 메세지를 입력받아 자신의 콘솔에 출력 (BufferedReader)
	 * 2. 입력받은 메세지를 다시 클라이언트로 출력한다 ( *server*를 문자열에 추가 )
	 * 
	 * 1.2 을 반복 
	 * ( 클라이언트가 종료 라는 문자열을 보내면 서버 자신도 프로그램을 종료한다 ) 
	 */
	public void go() {
		System.out.println("**EchoServer**");
	}
	public static void main(String[] args) {
		new EchoServer().go();
	}
}
