package step10;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable {
	private int makeCount;
	private int makePeriod;

	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}

	@Override
	public void run() {
		makeDir();
		try {
			makeFile();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
	public void makeDir() {
		File dir = new File(CommonInfo.MAKE_PATH);
		if (dir.isDirectory() == false)
			dir.mkdirs();
	}
	public void makeFile() throws InterruptedException, IOException {
		for (int i = 0; i < makeCount; i++) {
			String fileName=createFileName(i);
			File file=new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" 생성 - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}//for
	}//makeFile
	
	/*
	파일명을 생성하는 메서드, makeFile 메서드에서 호출해서 사용 
	매개변수의 인자값으로 전달한 정보를 이용하고 시간정보와 확장자를 추가해서 파일명을 만든 후 
	리턴하는 메서드 ( 예 : 4_1629858330231.avi ) 
	 */
	public String createFileName(int i) {
		String fileName=i+"_"+System.currentTimeMillis();
		Random r=new Random();
		if(r.nextBoolean())
			fileName+=".avi";
		else
			fileName+=".mp3";
		return fileName;
	}
}












