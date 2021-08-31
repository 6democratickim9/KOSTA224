package step09.ex.test.step1;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		String ext = null;
		if(r.nextBoolean())
			ext = ".avi";
		else
			ext = ".mp3";
		System.out.println(ext);
	}
}
