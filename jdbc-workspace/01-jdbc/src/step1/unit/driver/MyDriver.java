package step1.unit.driver;
//step1.unit.test.TestClass에서 로딩하는 클래스
public class MyDriver {
	private static String dbName="마이데이터베이스정보";
	static {
		System.out.println(dbName+" 연동을 위한 초기 작업");
	}

}
