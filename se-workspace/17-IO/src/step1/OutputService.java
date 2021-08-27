package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputService {
	public String filePath;
	public OutputService(String filePath) {
		super();
		this.filePath=filePath;
	}
		public void outputData(String data) throws IOException{
			//filePath�� �ش��ϴ� ���Ͽ� data�� ����Ѵ�
			//���Ͽ� ����Ǵ� NodeStream�� ����
//			FileWriter fw = new FileWriter();
			PrintWriter pw=null;//���������� �ݵ�� ����� �ʱ�ȭ
			try {
				pw = new PrintWriter(new FileWriter(filePath,true));
			pw.println(data);
			}finally {//finally�� �׻� ����
				if(pw!=null)//pw��Ʈ�� ��ü�� �����ϸ�
					pw.close();			
				}
			
			//��Ʈ���� �ݾ��ش�(���ᱭ �ڿ��� ������� �����ش�), 
//			���������� flush()�� ȣ���ؼ� buffer(�޸�)�� �ִ� ������ ���� ���Ͽ� ���
			
			
			//
			}
		
}

