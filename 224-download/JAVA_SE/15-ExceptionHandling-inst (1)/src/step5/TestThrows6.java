package step5;

import java.io.IOException;

/*
 *  CheckedException : throws 가 필요한 Exception 
 *  UnCheckedException : 별도의 throws가 명시가 필요없는 Exception -> RuntimeException 이 하위 클래스 (subclass) 
 */
class Test{
	public void test1(String salary) {
		int m=Integer.parseInt(salary);
		System.out.println("연봉:"+m*12);
	}
	public void test2(int i) throws IOException  {
		if(i<0)
			throw new IOException();
		System.out.println("정상 입출력");
	}
}
public class TestThrows6 {
	public static void main(String[] args) {
		Test t=new Test();
		//t.test1("400");
		//t.test1("사천");
		try {
			t.test2(7);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
