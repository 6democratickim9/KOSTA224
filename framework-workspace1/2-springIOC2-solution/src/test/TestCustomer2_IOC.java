package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.TicketService;

public class TestCustomer2_IOC {
	public static void main(String[] args) {
//		AsianaTicketService service= new AsianaTicketService();
////		service.asianaTicketing();
//		KalTicketService service = new KalTicketService();
//		service.kalTicketing();
		//항공사 변경 시
		//위와 같이 객체 생성부 및 기능 호출부를 변경해야 함
		//현재 구조에서는 의존하는 컴포넌트를 변경하기 위해서는 사용하는 측의 코드 영역에 변경 불가피
		//=결합도가 높은 상태
		
		//IOC 적용-> 결합도를 느슨학 함
		//1. 대상 컴포넌트들의 계층구조를 형성: 인터페이스 TicketService 추상메서드 ticketing()
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext();
		TicketService service =(TicketService) factory.getBean("ticket");
		service.ticketing();
		factory.close();
	}

}
