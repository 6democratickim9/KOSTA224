package step08;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;	
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	//run() : JVM이 스케줄링해서 호출하는 메서드 
	// 실제 스레드의 실행 내용을 정의하는 메서드 
	@Override
	public void run() {
		try {
			makeFile();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//makePeriod(1초 간격)으로 makeCount(10회) 실행 
	public void makeFile() throws InterruptedException {
		for(int i=0;i<makeCount;i++) {
			System.out.println("파일 생성 스레드 실행");
			Thread.sleep(makePeriod);
		}
	}
}













