package step2;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	//console���� �Է¹޴� ����
//	ģ�� �̸��� �Է��ϼ���: ���̿�
//	ģ�� �̸�: ������
//	
	
	public static void main(String[] args) {
		//�ֿܼ� ����Ǵ� NodeStream �� �Է½�Ʈ��
		InputStream is = System.in;
		Scanner s= new Scanner(is);
		while(true) {
			
			System.out.print("ģ�� �̸��� �Է��ϼ���: ");
			String name = s.nextLine();//�̸��� �Է��� enter ������ ������ ����Ѵ�
			if(name.equals("����")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				break;
			}
			else{
				System.out.println("ģ���̸�: "+name);
				
			}
			
		}s.close();
		//ProcessingStream ��� ����
		
	}

}
