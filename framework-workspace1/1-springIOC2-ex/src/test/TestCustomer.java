package test;

import model.KalTicketService;

public class TestCustomer {
	public static void main(String[] args) {
//		AsianaTicketService service= new AsianaTicketService();
//		service.asianaTicketing();
		KalTicketService service = new KalTicketService();
		service.kalTicketing();
		//항공사 변경 시
		//위와 같이 객체 생성부 및 기능 호출부를 변경해야 함
		//현재 구조에서는 의존하는 컴포넌트를 변경하기 위해서는 사용하는 측의 코드 영역에 변경 불가피
		//=결합도가 높은 상태
	}

}
