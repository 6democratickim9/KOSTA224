package step04;

public class VideoWorker implements Runnable{
			//run():JVM에 의해서 호출되는 실제 스레드 서비스가ㅏ 정의되어 있는 메서드
	@Override
	public void run() {
		for(int i =0; i<100;i++) {
			System.out.println("영상서비스 스레드 실행: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.2초간 중단 후 재개

		}//for
	}//run
}//class
