package step12;
//여러 개의 스레드(멀티 스레드) 는 하나의 객체를 공유해서 사용할 수 있다
//아래의 예제는 멀티 스레드가 하나의 객체를 이용해서 생성되고 실행되었을 떄 발생할 수 있는 문제점에 대해 확인하는 예제 -> 동기화 처리(synchronized) 의 필요성 확인
public class TestSynchronizedEx {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet,"박보검");
		Thread t2 = new Thread(toilet,"강하늘");
		t1.start();
		t2.start();
	}

}
