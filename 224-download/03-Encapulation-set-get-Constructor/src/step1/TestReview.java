package step1;

public class TestReview {
	public static void main(String[] args) {
//		Market ��ü ����
		Market m = new Market();
		System.out.println(m.name);
//		null�� ��µ� : ������ �������� ���� ��
		m.name="G����";
//		��ü�� name ������ �����Ҵ�
		System.out.println(m.name);
//		����̶�� ���ڸ� ����(argument)
		String searchResult = m.searchProduct("���");
		System.out.println("�˻����"+searchResult);
	}

}
