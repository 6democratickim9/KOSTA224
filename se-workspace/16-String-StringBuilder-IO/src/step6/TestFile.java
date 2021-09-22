package step6;
//java.io.File�� �̿��� ���� ������ �ٷ�� ����

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		String path="C:"+File.separator+"KOSTA224";
		File dir = new File(path);//������:\
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.getPath());
		File dir2 = new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.getPath());
		System.out.println(dir2.exists());
		//directory�� ������ ������
		System.out.println("mkdir:"+dir2.mkdir());
		//iotest�� ���� ��ġ�� �ٸ� iotest2�� �����ϰ� ���� ���丮 music�� �� �� �����ؼ� �Բ� �����غ���
		//dir2 �� ���� ���丮 ��ü�� ��ȯ�޴´� getParentFile();
		File pd=dir2.getParentFile();
		System.out.println(pd.getPath());
		File dir3 = new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		System.out.println(dir3.getPath());
		System.out.println(dir3.mkdirs());
		File file=new File(dir.getPath()+File.separator+"info3.txt");
		try {
			System.out.println("file ����: "+file.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
