package step2;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	//console에서 입력받는 예제
//	친구 이름을 입력하세요: 아이우
//	친구 이름: 아이유
//	
	
	public static void main(String[] args) {
		//콘솔에 연결되는 NodeStream 중 입력스트림
		InputStream is = System.in;
		Scanner s= new Scanner(is);
		while(true) {
			
			System.out.print("친구 이름을 입력하세요: ");
			String name = s.nextLine();//이름을 입력해 enter 누르기 전까지 대기한다
			if(name.equals("종료")) {
				System.out.println("프로그램이 종료되었습니다");
				break;
			}
			else{
				System.out.println("친구이름: "+name);
				
			}
			
		}s.close();
		//ProcessingStream 기능 지원
		
	}

}
