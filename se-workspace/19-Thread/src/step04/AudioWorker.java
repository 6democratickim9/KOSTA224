package step04;

public class AudioWorker implements Runnable{
//JVM�� ���� ȣ��, thread service�� �����ϴ� �޼���
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<100;i++) {
			System.out.println("���⼭�� ������ ����: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.2�ʰ� �ߴ� �� �簳

		}
	}
	
	
}
