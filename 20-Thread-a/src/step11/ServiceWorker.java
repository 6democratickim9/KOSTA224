package step11;

public class ServiceWorker implements Runnable{
	private String shareInfo="�����ڿ�";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+shareInfo+" �̿��� ���� "+i);
			
		}
	}
	
}
