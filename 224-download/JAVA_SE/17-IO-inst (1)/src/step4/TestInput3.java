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
			//readLine() �� �̿��ؼ� ���� ������ ������ ������ �ݺ��ϸ鼭 �ֿܼ� ��� 
			//ù ������ �Է¹޾� ������ ���� �� while���� null���� �� �� �ֿܼ� ���, �ٽ� ���� ���� �Է��ؼ� ������ �Ҵ��� �ݺ� 
			/*
			 * String data=br.readLine();//ù ������ �Է¹޴´� while(data!=null) {
			 * System.out.println(data); data=br.readLine();//���� ������ �Է¹޴´� }
			 */
			while(br.ready()) {//�Է¹��� ������ ������ true
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