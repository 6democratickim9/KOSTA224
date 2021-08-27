package step12;

public class Toilet implements Runnable{
	private boolean seat;//인스턴스 변수 기본 초기화 false
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
	public void use(String guestName) throws InterruptedException {
		
		if(seat==false) {
			Thread.sleep(1000);
			seat=true;
			System.out.println(guestName+"님 입장");
			Thread.sleep(2000);
			System.out.println(guestName+"님 퇴장");	
			seat=false;
		
		}else {
			System.out.println(guestName+"님 현재 화장실을 다른 분이 사용중입니다.");
		}
		
	}

}
