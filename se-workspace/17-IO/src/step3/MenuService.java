package step3;

import java.io.File;

public class MenuService {
	private String path;

	public MenuService(String path) {
		super();
		this.path = path;
		File dir = new File(path).getParentFile();
		if(dir.isDirectory()==false)
			dir.mkdirs();//디렉토리를 생성한다
			
	}
	
	public void order() {
		
	}

}
