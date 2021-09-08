package step2;

public class Bird implements Flyer {
	//인터페이스에 명시된 추상 메서드는 반드시 구현해야! 
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
}
