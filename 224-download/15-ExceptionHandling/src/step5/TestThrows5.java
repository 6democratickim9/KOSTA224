package step5;

import java.util.ArrayList;

import step4.DayException;
//Exception은 UncheckecException계열과 CheckedException 계열로 구분할 수 있다
//UnCheckedException은 RuntimeException의 하위(자식) 클래스들을 말하며 생성자나 메서드에서 별도의 throws 없이도 호출한 측으로 전파되는 성질을 가짐
//CheckedException은 RuntimeException의 계열(자식)이 아니느 모든 Exception을 말하면 생성자나 메서드에서 Exception발생 시 throws를 반드시 명시해야 함(하지 않으면 compile error 발색)
class ExceptionEx{
	public void test1(String name) {//throws NullPointException 을 하지 않아도 호출한 측으로 던져진다 -> RunTimeException의 하위 Exception이이므로
		//즉 RuntimeException 계열의 Exception은 별도의 throws를 명시할 필요가 없다
		System.out.println(name.length()+"자 이름입니다");}
		//해당 메서드는}
	//IndexOutOfBoundException은 RuntimeException의 자식 클래스이므로 별도의 throws 없이 호출한 측으로 전달됨
	public void test2(int index) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("kimbab");
		list.add("ramen");
		System.out.println(list.get(index));
	}
	public void test3(int day) throws DayException{
		if (day<1||day>31) {
			throw new DayException("잘못된 날짜입니다");
		}
		System.out.println(day+"일로 결제일 지정됨");
	}
	
}

public class TestThrows5 {
	public static void main(String[] args) {
		ExceptionEx ex =new ExceptionEx();
//		ex.test1("RM");
		//정상 흐름 테스트
		//예외 흐름 테스트
//		ex.test(null);
		ex.test2(1);
		try {
			ex.test3(2);
		}catch(DayException e) {
			e.printStackTrace();
		}
	}

}
