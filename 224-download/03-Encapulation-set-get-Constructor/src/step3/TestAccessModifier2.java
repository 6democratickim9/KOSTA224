package step3;
import step2.Account;
public class TestAccessModifier2 {
/*
 * step3 ��Ű�� Ŭ��������
 * step2 ��Ű�� Ŭ������ ����� �����ؼ�
 * ���������� �׽�Ʈ�غ��� ����
 * 
 * import:ctrl+shift+o
 * import�� �ٸ� ��Ű���� Ŭ������ ����ϱ� ���ؼ� �ۼ��ϴ� ����
 * 
 */
		public static void main(String[] args) {
			Account a = new Account();
			System.out.println(a.no1);
//			default�� �ٸ� ��Ű�������� ���ٺҰ�
//			System.out.println(a.no1);
//			private�� �ڽ��� Ŭ���� �������� ���ٰ����ϹǷ� ���ٺҰ�
//			System.out.println(a.no3);
			a.deposit(200);
		}
}