package step09.ex.test.step4;

import java.io.File;

//���� �̵���Ű�� ���� �׽�Ʈ
//File class�� renameTo()�� �̿��ϸ� �ȴ�
public class TestFileMove {
	public static void main(String[] args) {
		String orgPath = "C:\\KOSTA224\\iotest\\org\\img (4).jpg";
		String destPath="C:\\\\KOSTA224\\\\iotest\\\\dest\\\\babymoana.jpg";
		File orgFile = new File(orgPath);
		File destFile = new File(destPath);
		boolean result = orgFile.renameTo(destFile);
		System.out.println("move "+result);
	}

}
