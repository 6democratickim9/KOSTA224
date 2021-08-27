package step3;
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의 
	public void eat() {
		System.out.println("사람이 수저를 사용하다");
		super.eat();//super keyword를 이용해 부모 eat 메서드를 호출 
	}
}
class Dog extends Animal{
	//메서드 오버라이딩
	public void eat() {
		System.out.println("강아지가 혓바닥을 사용하다");
		super.eat();
	}
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();//오버라이딩된 자신의 메서드가 실행 
		Dog d=new Dog();
		d.eat();//오버라이딩된 메서드가 실행 	
	}
}





