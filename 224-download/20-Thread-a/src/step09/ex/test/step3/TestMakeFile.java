package step09.ex.test.step3;
//�������� �����ϴ� ���� �׽�Ʈ

import java.io.File;
import java.io.IOException;

public class TestMakeFile {
	public static void main(String[] args) {
		File file=new File("C:\\kosta224\\iotest\\1.mp3");
		try {
			boolean b = file.createNewFile();
			
			System.out.println("�Ϸ�"+b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
