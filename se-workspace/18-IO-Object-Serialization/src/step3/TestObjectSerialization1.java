package step3;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		String path ="C:\\KOSTA224\\iotest\\account.obj";
		AccountVO avo = new AccountVO("아이유",200,"starjava");
		AccountService service = new AccountService(path);
		service.saveObject(avo);
		System.out.println("계좌정보 직렬하여 파일에 저장");
	}

}
