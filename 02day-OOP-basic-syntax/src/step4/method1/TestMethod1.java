package step4.method1;
//Method 케이스별로 테스트하는 예제
/*
 * 1. 매개변수와 리턴값이 없는 경우
 * 2. 매개변수가 있는 경우
 * 3. 리턴값이 있는 경우
 */
public class TestMethod1 {
	//메인메서드:프로그램의 시작점
	public static void main(String[] args) {
		Person p = new Person();//Person 객체 생성
		p.eat1();//메서드 호출
		p.eat2("햄버거");
		
	}

}
