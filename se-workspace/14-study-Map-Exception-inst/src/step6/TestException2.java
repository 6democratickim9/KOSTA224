package step6;
/*
 *  case 1 
 *  프로그램 실행시 Exception 상황 발생되면 
 *  JVM은 Exception 객체를 생성해 메세지를 콘솔에 출력하고 프로그램 종료시키는 것을 확인하는 예제 
 *  
 *  아래 코드를 실행하면 
 *  JVM 은 Exception in thread "main" java.lang.NullPointerException
	at step6.TestException1.main(TestException1.java:11) 
	메세지를 콘솔화면에 출력하고 프로그램은 비정상 종료된다 
	
	case 2 
	TestException1 상황에서 Exception Handling(예외처리) 을 하는 예제 
	try 와 catch 라는 자바 키워드를 이용해 특정 예외 상황이 발생되면 대안흐름을 실행하고
	프로그램은 정상 수행되도록 예외를 처리한다 
	try{
		//예외 상황 발생 예상 지점 
	}catch(NullPointerException ne){ // 예외가 발생될 때 catch 구문이 실행된다 
		//예외 처리하여 대안 흐름을 실행하는 영역 
	}
	case 1 과 case 2 의 차이는 case2 에서 try catch 를 이용해 Exception Handling 해서 
	예외 상황 발생시 프로그램 비정상 종료되지 않고 
	대안흐름을 실행한 후 프로그램은 정상 수행 되는 데 있다 
	
	
	
 */
public class TestException2 {
	public static void main(String[] args) {
		String name="아이유";
		//test를 위해 name에 null로 재할당해본다 
		name=null;
		try { // try 블럭은 예외 발생 예상 지점 
			System.out.println(name.length());
		}catch(NullPointerException ne) {// 예외 발생하면 실행되는 영역 
			System.out.println("name 정보가 없으므로 길이를 구할 수 없습니다");
		}
		System.out.println("프로그램 정상 수행");
	}
}
























