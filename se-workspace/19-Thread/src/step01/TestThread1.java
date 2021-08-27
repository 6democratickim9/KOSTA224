package step01;
// 단일 스레드 환경 (main Thread)
// TestThread1 program을 실행시켜 실행중이면 프로쓰가 하나 실행중이고
//이 프로세스 내의 실행 단위인 Thread(일꾼) 가 하나 실행된다

//아래 프로그램을 실행한 수 main thread 종료 출력시점을 TestThread2와 비교해본다

class SingleThreadTest{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("main thread: "+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		System.out.println("**** main thread 종료****");
		
	}
// main
}
