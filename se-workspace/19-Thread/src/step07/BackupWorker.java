package step07;

public class BackupWorker implements Runnable {

	@Override
	public void run() {
		while (true) {
			// TODO Auto-generated method stub
			try {
				backup();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void backup() throws InterruptedException {
		Thread.sleep(3000);// 3�ʰ������� ���
		System.out.println("��������尡 ���幮���� ���ó��");
	}
}
