package step13;

public class Toilet implements Runnable{
	private boolean seat;//�ν��Ͻ� ���� �⺻ �ʱ�ȭ false
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Ư�� ������ ���� ������ ȯ������ �����	
	public synchronized use(String guestName) throws InterruptedException {
		
//		if(seat==false) {
			Thread.sleep(1000);
			seat=true;
			System.out.println(guestName+"�� ����");
			Thread.sleep(2000);
			System.out.println(guestName+"�� ����");	
//			seat=false;
//		
//		}else {
//			System.out.println(guestName+"�� ���� ȭ����� �ٸ� ���� ������Դϴ�.");
//		}
//		
	}

}
