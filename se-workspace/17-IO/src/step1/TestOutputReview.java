package step1;

import java.io.IOException;

public class TestOutputReview {
	public static void main(String[] args) {
		String filePath = "C:\\KOSTA224\\iotest\\friend.txt";
		OutputService service = new OutputService(filePath);
		try {
			service.outputData("minju");
			System.out.println("��¿Ϸ�");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("���α׷� �������");

		}

}
