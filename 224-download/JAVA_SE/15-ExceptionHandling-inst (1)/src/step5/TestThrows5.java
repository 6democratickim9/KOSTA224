package step5;

import java.util.ArrayList;

import step4.DayException;
/* Exception 은 UnChekedException 계열과 CheckedException 계열로 구분할 수 있다 
 * UnCheckedException은 RuntimeException 의 하위(자식) 클래스들을 말하며 생성자나 메서드에서 별도의 throws 없이도 호출한 측으로
 * 전파되는 성질을 가진다 
 * CheckedException은 RuntimeException 계열(즉 자식 ) 이 아닌 모든 Exception 을 말하면 생성자나 메서드에서 
 * Exception 발생시 throws 를 반드시 명시해야 한다 ( 명시하지 않으면 compile error 가 난다 ) 
 */
class ExceptionEx{
	/*
	 * 아래 메서드는 
	 * throws NullPointerException 을 하지 않아도 호출한 측으로 던져진다. 
	 * 이유는 RuntimeException의 하위 Exception이므로
	 * 즉 RuntimeException 계열의 Exception은 별도의 throws 를 명시할 필요가 없다 
	 */
	public void test1(String name){ 
		System.out.println(name.length()+"자 이름입니다");
	}
	// IndexOutOfBoundsException은 RuntimeException의 자식 클래스이므로 별도의 throws 없이 호출한 측으로 전달된다 
	public void test2(int index) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("김밥");//0
		list.add("라면");//1
		System.out.println(list.get(index));
	}
	//아래 DayException 은 RuntimeException의 자식이 아니므로 throws를 반드시 명시해야 한다 
	public void test3(int day) throws DayException {
		if(day<1||day>31)
			throw new DayException("잘못된 날짜정보입니다");
		System.out.println(day+"일로 결제일이 정해졌습니다");
	}
}
public class TestThrows5 {
	public static void main(String[] args) {
		ExceptionEx ex=new ExceptionEx();
		//정상 흐름 테스트 
		//ex.test1("RM");
		//예외 흐름 테스트 
		//ex.test1(null);
		//정상 흐름 테스트 
		//ex.test2(0);
		//예외 흐름 테스트 
		//ex.test2(2);
		try {
			ex.test3(2);
		} catch (DayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
