package step5.ex;

public class EchoClient {
	/*
	 *  서버에 접속하여 
	 *  1.콘솔에서 입력 (Scanner)  
	 *  2.서버로 출력 (PrintWriter) 
	 *  3.다시 서버에서 보낸 메세지를 입력(BufferedReader)받아 콘솔에 출력 
	 *  
	 *  1.2.3을 반복 ( 종료 라는 문자열을 콘솔에 입력하면 클라이언트 프로그램 종료되도록 한다 ) 
	 */
	public void go() {
		System.out.println("**EchoClient**");
	}
	public static void main(String[] args) {
		new EchoClient().go();
	}
}
