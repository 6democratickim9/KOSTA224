package Chapter33;
abstract class A{
	public abstract int b();
	//��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����
	//�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� ����
	public void d() {
		System.out.println("world");
	}
public class AbstractDemo {
	public static void main(String[] args) {
		A obj = new A();
	}
}

}
