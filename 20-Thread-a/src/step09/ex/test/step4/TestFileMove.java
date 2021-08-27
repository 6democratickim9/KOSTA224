package step09.ex.test.step4;

import java.io.File;

//파일 이동시키는 단위 테스트
//File class의 renameTo()를 이용하면 된다
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
