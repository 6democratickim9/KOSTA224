package test;
//��ø Ŭ����
//class ���ο� class ����
//private member�� �ٸ� Ŭ�������� ������ �� ������ nested class������ ���ٰ���
//�ݵ�� Outer class �� ��ü ������ ���ؼ� inner class���� ����
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
