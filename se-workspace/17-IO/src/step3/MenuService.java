package step3;

import java.io.File;

public class MenuService {
	private String path;

	public MenuService(String path) {
		super();
		this.path = path;
		File dir = new File(path).getParentFile();
		if(dir.isDirectory()==false)
			dir.mkdirs();//���丮�� �����Ѵ�
			
	}
	
	public void order() {
		
	}

}
