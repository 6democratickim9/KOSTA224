package step04;

public class AudioWorker implements Runnable{
//JVM에 의해 호출, thread service를 정의하는 메서드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<100;i++) {
			System.out.println("음향서비스 스레드 실행: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.2초간 중단 후 재개

		}
	}
	
	
}
