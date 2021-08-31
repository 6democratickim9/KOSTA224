package step3;
/*
 *   Exception Handling ���� ó���� ���� ���� ����� �����غ��� ���� 
 *   try, catch , finally , throws , throw ���ظ� Ȯ���غ��� ���� -> ���� ��� 
 */
class TestException extends Exception {
	/**
	 * ���� ���ο��� 
	 */
	private static final long serialVersionUID = 6053676066141987488L;

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
			//���� �߻� case �׽�Ʈ �غ���
			//s.test(null);
			//���� ���� case �׽�Ʈ �غ��� 
			s.test("�ų���");
		} catch (TestException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("f");
	}
}
