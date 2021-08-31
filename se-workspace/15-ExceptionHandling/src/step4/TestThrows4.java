package step4;

public class TestThrows4 {
	public static void main(String[] args) {
		MyDate date= new MyDate();
		// date.day44;private이므로 compile error
		try {//1~31인 값을 전달 - 정상 흐름 테스트
//			date.setDay(1);
			date.setDay(32);
			System.out.println(date.getDay());
		}catch(DayException e) {
			System.out.println(e.getMessage());
		}
	}

}
