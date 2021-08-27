package step7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput1 {
//	출력스트림 예제
//	특정 파일을 생성해서 데이터를 출력해보는 예제
	public static void main(String[] args) throws IOException {
		try {
			//장치에 연결되는 Node Stream 계열을 생성
			FileWriter fw = new FileWriter("C:\\KOSTA224\\iotest\\memo.txt");
			//기능을 지원하는 Processing Stream 계열을 생성
			PrintWriter pw = new PrintWriter(fw);
			pw.println("쉬는시간");
			System.out.println("파일생성 및 출력");
			pw.close();//스ㅡ트림을 닫아준다(이 때 메모리에 있는 데이터를 실제 파일에 출력- flush)
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
