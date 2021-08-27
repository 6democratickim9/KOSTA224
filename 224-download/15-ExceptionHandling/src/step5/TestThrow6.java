package step5;
// CheckedException: throws가 필요한 Exception
// UnckedExcpetion: 별도의 throws가 명시가 필요없는 Exception  -> RuntimeException이 하위 클래스(subclass)


class Test{
	public void test1(String salary) {
		int m = Integer.parseInt(salary);
		System.out.println("연봉: "+m*12);
	}
	public void test2(int i) throws IOException{
		if(i<0)
			throw new IOException();
		System.out.println("정상 입출력");
	}
	
}

public class TestThrow6 {
	public static void main(String[] args) {
		Test t = new Test();
	}

}
