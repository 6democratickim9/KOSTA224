package step3;
// Exception Hnadling 예외 처리에 대한 실행 결과를 예상해보는 예제
// try,catch, finally, throws, throw 이해를 확인해보는 예제 -> 복습 대상
class TestException extends Exception {
	/**
	 * 이후 공부예정
	 */
	private static final long serialVersionUID = 605768478980990L;

	TestException(String message) {
		super(message);
	}
}
class Service {
	public void test(String name) throws TestException {
		try {
			if (name == null) {
				throw new TestException("a");
			}
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
public class TestThrows3 {
	public static void main(String[] args) {
		Service s=new Service();
		try {
			//예외 발생 case 테스트 해본다
//			s.test(null);
			//정상 수행 case 테스트 해본다
			s.test("신나넹");
		} catch (TestException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("f");
	}
}

