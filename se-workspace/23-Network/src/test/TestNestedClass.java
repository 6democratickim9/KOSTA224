package test;
//중첩 클래스
//class 내부에 class 정의
//private member는 다른 클래스에서 접근할 수 없지만 nested class에서는 접근가능
//반드시 Outer class 의 객체 생성을 통해서 inner class생성 가능
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer= new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.test();
		outer.writeTest();
		System.out.println("***********");
		ClientOuter co = new ClientOuter();
		
	}

}
