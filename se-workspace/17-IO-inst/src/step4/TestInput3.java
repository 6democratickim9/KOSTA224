package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput3 {
	public static void main(String[] args) {
		String path="C:\\kosta224\\iotest2\\lunch\\menu.txt";
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			//readLine() 을 이용해서 읽을 라인이 존재할 때까지 반복하면서 콘솔에 출력 
			//첫 라인을 입력받아 변수에 저장 후 while에서 null인지 비교 후 콘솔에 출력, 다시 다음 라인 입력해서 변수에 할당을 반복 
			/*
			 * String data=br.readLine();//첫 라인을 입력받는다 while(data!=null) {
			 * System.out.println(data); data=br.readLine();//다음 라인을 입력받는다 }
			 */
			while(br.ready()) {//입력받을 정보가 있으면 true
				System.out.println(br.readLine());
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
