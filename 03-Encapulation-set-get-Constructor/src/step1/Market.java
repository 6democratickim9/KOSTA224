package step1;// package: Ŭ�������� ���丮���� �з��Ͽ� ����
//public :���� ���� ����; ����������
public class Market {
//	�ν��Ͻ� ����
//	String: ���ڿ� ������ Ÿ��
	String name;
//	�޼���: ��ü�� ����� ����
//	keyword: �Ű�����(Parameter)
//	return �� ������ ȣ���� ������ ��ȯ�ϱ� ���� ����ϴ� �ڹ� �����
	public String searchProduct(String keyword) {
		System.out.println("DB���� ���� ��ȸ");
		return name+":"+keyword+"��ǰ�˻����-> �����, �Ŷ��";
	}
}
