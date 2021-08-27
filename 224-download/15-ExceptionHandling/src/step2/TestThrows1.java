package step2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MemoService{
	public void readMemo(String filePath) throws FileNotFoundException{
		try {
			FileReader fr=new FileReader(filePath);
			System.out.println(filePath+"파일 패스 받는중");	
		}finally {
			System.out.println("finally는 예외 발생 여부와 관계없이 반드시 실행해야 하는 기능을 명시");
		}
	}
}
public class TestThrows1 {
	public static void main(String[] args)  {
		MemoService service=new MemoService();
		String filePath="C:\\kosta224\\b.txt"; //존재하지 않는 파일 테스트
		try {
			service.readMemo(filePath);
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); // 예외 메세지와 발생 경로 모두 출력
			System.out.println(e.getMessage());//getMessage() 예외 메세지를 반환(간결, 한글)
		}
		System.out.println("프로그램 정상 실행");
	}
}
