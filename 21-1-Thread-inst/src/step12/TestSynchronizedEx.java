package step12;
/*
 *  ���� ���� ������( ��Ƽ ������ ) �� �ϳ��� ��ü�� �����ؼ� ����� �� �ִ� -> ���� 
 *  �Ʒ��� ������ ��Ƽ �����尡 �ϳ��� ��ü�� �̿��ؼ� �����ǰ� ����Ǿ��� �� �߻��� �� �ִ� 
 *  �������� ���� Ȯ���ϴ� ���� -> ����ȭ ó�� (synchronized)�� �ʿ伺�� Ȯ�� 
 *  
 *  �� ) ī�� ȭ����� �¼�(�����ڿ�)�� �ϳ��̰� ���� �մԵ�(��Ƽ ������)�� ����� �� �߻��� �� �ִ� ������ Ȯ��  
 */
public class TestSynchronizedEx {
	public static void main(String[] args) {
		Toilet toilet=new Toilet();//�����ڿ�
		Thread t1=new Thread(toilet,"�ں���");
		Thread t2=new Thread(toilet,"���ϴ�");
		t1.start();
		t2.start();
	}
}


















