package step4.method1;

public class Person {
	/*
	 * method case 1
	 * 매개변수와 리턴값이 없는 메서드
	 * 호출되면 실행되는 메서드
	 */
	public void eat1() {
		System.out.println("먹다");
	}
	/*
	 * method case2
	 * 매개변수가 정의된 메서드
	 * 호출한 측에서 데이터를 매개변수를 전달받는다
	 */
	public void eat2(String food) {
		System.out.println(food+" 먹다");
		
	}
}
