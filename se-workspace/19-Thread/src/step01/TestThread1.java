package step01;
// ���� ������ ȯ�� (main Thread)
// TestThread1 program�� ������� �������̸� ���ξ��� �ϳ� �������̰�
//�� ���μ��� ���� ���� ������ Thread(�ϲ�) �� �ϳ� ����ȴ�

//�Ʒ� ���α׷��� ������ �� main thread ���� ��½����� TestThread2�� ���غ���

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
		System.out.println("**** main thread ����****");
		
	}
// main
}