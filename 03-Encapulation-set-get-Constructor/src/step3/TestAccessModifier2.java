package step3;
import step2.Account;
public class TestAccessModifier2 {
/*
 * step3 패키지 클래스에서
 * step2 패키지 클래스의 멤버에 접근해서
 * 접근제어자 테스트해보는 예제
 * 
 * import:ctrl+shift+o
 * import는 다른 패키지의 클래스를 사용하기 위해서 작성하는 구문
 * 
 */
		public static void main(String[] args) {
			Account a = new Account();
			System.out.println(a.no1);
//			default는 다른 패키지에서는 접근불가
//			System.out.println(a.no1);
//			private는 자신의 클래스 내에서만 접근가능하므로 접근불가
//			System.out.println(a.no3);
			a.deposit(200);
		}
}