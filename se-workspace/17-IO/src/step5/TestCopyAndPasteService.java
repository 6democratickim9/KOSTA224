package step5;

public class TestCopyAndPasteService {
	public static void main(String[] args) {
		String copyFilePath = "C:\\KOSTA224\\iotest2\\lunch\\menu.txt";
		String pasteFilePath = "C:\\KOSTA224\\iotest3\\dinner\\복사본-메뉴.txt";
		FileService service = new FileService(copyFilePath,pasteFilePath);
		System.out.println("ok");
		service.copyAndPaste();
	}
	

}
