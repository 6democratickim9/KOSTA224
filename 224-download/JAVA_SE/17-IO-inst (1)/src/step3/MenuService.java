package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;
	/*
	 * ������ �Ű������� ���޹޴� ���ϰ�ο� �ش��ϴ� ���丮�� �������� �ʴ´ٸ� ���丮�� �����Ѵ� java.io.File
	 * getParentFile() , isDirectory() , mkdirs()
	 */
	public MenuService(String path) {
		super();
		this.path = path;
		// ���� ����� ���� ���丮 ������ ��ȯ�޴´�
		File dir = new File(path).getParentFile(); // System.out.println(dir.getPath());
		if (dir.isDirectory() == false)// ���丮�� ������
			dir.mkdirs();// ���丮�� �����Ѵ�
	}

	// throws
	// System.in , Scanner , FileWriter , PrintWriter
	public void order() throws IOException {
		Scanner s=null;
		PrintWriter pw=null;
		try {
			//�Է½�Ʈ��
			s=new Scanner(System.in);
			pw=new PrintWriter(new FileWriter(path,true));
			//while , s.nextLine() , pw.println() 
			while(true) {
				System.out.print("���ɸ޴��� �ֹ��ϼ���:");
				String order=s.nextLine();//����ϴ� �޴��Է� �� ���� ������ ����
				if(order.equals("�ֹ���")) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�");
					break;
				}
				pw.println(order);//���Ͽ� ����Ѵ�
				System.out.println(order+" �ֹ�");
			}
			
		}finally {
			if(pw!=null)
				pw.close();//close �ÿ� flush() �� ��� 
			if(s!=null)
				s.close();
		}//finally
	}//method
}//class



















