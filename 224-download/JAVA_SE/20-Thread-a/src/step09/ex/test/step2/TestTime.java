package step09.ex.test.step2;

import java.text.SimpleDateFormat;

public class TestTime {
// ������ ���ϸ��� ����� ���� �ð������� �̿��ϴ� �����׽�Ʈ
//	java: System.currentTimeMills()�޼��� �̿�
//	��ȯ�Ǵ� ���� long ����, ���� ǥ�ؽ� 1970�� 1�� 1�� 0�� 0�� �������� �� �и������尡 �귶���� ����� ��-> ���н� �ð�
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		//�ð� ������ long �� �����͸� �ð� ������ �����ؼ� Ȯ���غ���
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		System.out.println(nowTime);
		
	}
}
