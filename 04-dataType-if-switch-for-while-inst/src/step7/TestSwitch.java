package step7;

public class TestSwitch {
	// switch case 구문 ( 조건문 ) 
	public static void main(String[] args) {
		int grade=1;
		switch(grade) {
		case 1:
			System.out.println("제네시스");
			//실행문을 벗어난다 
		case 2:
			System.out.println("그랜저");
			break;
		case 3:
			System.out.println("아반떼");
			break;
		case 4:
			System.out.println("모닝");
			break;
		default:
			System.out.println("따릉이");
		}
	}
}
