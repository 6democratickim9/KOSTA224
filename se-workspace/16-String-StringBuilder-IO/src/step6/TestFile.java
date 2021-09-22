package step6;
//java.io.File을 이용해 실제 파일을 다루는 예제

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		String path="C:"+File.separator+"KOSTA224";
		File dir = new File(path);//구분자:\
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.getPath());
		File dir2 = new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.getPath());
		System.out.println(dir2.exists());
		//directory를 실제로 만들어본다
		System.out.println("mkdir:"+dir2.mkdir());
		//iotest와 같은 위치에 다른 iotest2를 생성하고 하위 디렉토리 music을 한 번 실행해서 함꼐 생성해본다
		//dir2 의 상위 디렉토리 객체를 반환받는다 getParentFile();
		File pd=dir2.getParentFile();
		System.out.println(pd.getPath());
		File dir3 = new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		System.out.println(dir3.getPath());
		System.out.println(dir3.mkdirs());
		File file=new File(dir.getPath()+File.separator+"info3.txt");
		try {
			System.out.println("file 생성: "+file.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
