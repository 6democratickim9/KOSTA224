package step4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestInput1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\KOSTA224\\iotest2\\lunch\\menu.txt");
			BufferedReader br = new BufferedReader(fr);
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}

