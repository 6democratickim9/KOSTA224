package step4;

public class TestThrows4 {
	public static void main(String[] args) {
		MyDate date=new MyDate();
		//date.day=44;//private이므로 compile error
		try {
		//1~31 인 값을 전달 - 정상 흐름 테스트 -> 1이 출력 
		date.setDay(1);
		//1~31 이 아닌 값을 전달 - 예외 흐름 테스트 -> 예외 메세지 출력 
		//date.setDay(32);
		System.out.println(date.getDay());
		}catch(DayException e) {
			//1일 이상 31일 이하의 값만 할당 가능! 
			System.out.println(e.getMessage());
		}
	}
}
