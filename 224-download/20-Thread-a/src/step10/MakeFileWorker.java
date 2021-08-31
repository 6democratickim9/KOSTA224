package step10;

import java.io.File;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	public void run() {
		makeDir();
		try {
			makeFile();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	public void makeDir() {
		File dir = new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();
	}
	public void makeFile() throws InterruptedException {
		for(int i=0;i<makeCount;i++) {
			String fileName = createFileName(i);
			System.out.println(fileName +" ���� - MakeFileWorker Thread");
			Thread.sleep(makePeriod);
		}
	}
	//���ϸ��� �����ϴ� �޼���, makeFile �޼��忡�� ȣ���ؼ� ���
	//�Ű������� ���ڰ����� ������ ������ �̿��ϰ� �ð������� Ȯ���ڸ� �߰��ؼ� ���ϸ��� ���� �� 
	//�����ϴ� �޼���
	public String createFileName(int i) {
		String fileName = i+"_"+System.currentTimeMillis();
		Random r= new Random();
		if(r.nextBoolean())
			fileName+=".avi";
		else
			fileName+=".mp3";
		
		return fileName;
	}
	
}
