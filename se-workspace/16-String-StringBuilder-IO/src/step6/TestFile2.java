package step6;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		File dir=new File("C:\\KOSTA224");
		File fa[]=dir.listFiles();
		for(int i=0; i<fa.length;i++) {
			System.out.println(fa[i].getName());
		}
				
	}

}
