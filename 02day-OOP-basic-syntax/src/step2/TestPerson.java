package step2;

public class TestPerson {
	public static void main(String[] args) {
		/*��ü ������ ���� �ڵ����
		 * Person: Ŭ�������̰� ������ ������ Ÿ��
		 * p: ����, ��������, ��ü�� �����ϱ� ���� �ּҰ��� �����ϴ� ����
		 * =:assign:�Ҵ�
		 * new: ��ü ������ ���� �ڹ� Ű����
		 * Person():������ constructor
		 */
		Person p =new Person();
		System.out.println(p.name);//��ü�� �Ӽ��� ������ �� ���
		p.eat();
//		����=�Ӽ����� ���Ҵ�
		p.name="�̰���";
		System.out.println(p.name);
		p.eat();
	}

}
