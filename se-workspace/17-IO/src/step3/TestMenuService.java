package step3;

public class TestMenuService {
	public static void main(String[] args) {
		String path="C:\\KOSTA224\\iotest2\\lunch\\menu.txt";
		MenuService service = new MenuService(path);
		service.order();
	}

}
