package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput1 {
//	��½�Ʈ�� ����
//	Ư�� ������ �����ؼ� �����͸� ����غ��� ����
	public static void main(String[] args) throws IOException {
		try {
			//��ġ�� ����Ǵ� Node Stream �迭�� ����
			FileWriter fw = new FileWriter("C:\\KOSTA224\\iotest\\memo.txt");
			//����� �����ϴ� Processing Stream �迭�� ����
			PrintWriter pw = new PrintWriter(fw);
			pw.println("���½ð�");
			System.out.println("���ϻ��� �� ���");
			pw.close();//����Ʈ���� �ݾ��ش�(�� �� �޸𸮿� �ִ� �����͸� ���� ���Ͽ� ���- flush)
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
