package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	private String copyFilePath;
	private String pasteFilePath;
	public FileService(String copryFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copryFilePath;
		this.pasteFilePath = pasteFilePath;
		
		File dir = new File(pasteFilePath).getParentFile();
		if(dir.isDirectory()==false)
			dir.mkdirs();
	}
	public void copyAndPaste() throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			
			br = new BufferedReader(new FileReader(copyFilePath));
			pw = new PrintWriter(new FileWriter(pasteFilePath));
			String data = br.readLine();
			while(data!=null) {
				pw.println(data);
				data = br.readLine();
				}
		}finally {
			if(pw!=null)
				br.close();
			if(br!=null)
				br.close();
		}	
		
	}
	
	
}
