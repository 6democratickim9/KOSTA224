package step8;

import java.io.IOException;

public class TestOutput2 {
	public static void main(String[] args) {
		String path="C:\\KOSTA224\\iotest\\dinner.txt";
		OutputService service = new OutputService(path);
		try {
			service.writeFile("ȣ����ġŲ");
			System.out.println("data printed");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
