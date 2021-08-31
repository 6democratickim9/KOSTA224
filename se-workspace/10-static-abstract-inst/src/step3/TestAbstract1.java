package step3;
//abstract class 와 abstract method test 
//abstract class 는 직접 객체화 될 수 없다 -> 부모 클래스 역할에 집중
//abstract method가 하나 이상 존재하면 해당 클래스는 abstract 로 선언되어야 한다 
abstract class Animal{
	Animal(){
		System.out.println("Animal 객체 생성");
	}
	//abstract method는 구현부가 존재하지 않고 선언만 한다 
	//자식(하위) 클래스에게 구현을 강제한다 
	public abstract void eat();
}
// Animal 을 상속 받으면 Animal의 abstract method를 구현하거나 아니면 자신도 abstract로 선언되어야 한다 
class Person extends Animal{
	Person(){ super();
		System.out.println("Person 객체 생성");
	}
	@Override
	public void eat() {
		System.out.println("사람이 먹다");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//Animal a=new Animal();// abstract class 는 실재화 할 수 없다( 즉 직접 객체 생성 할 수 없음 ) 
		Animal a=new Person();//자식 객체 생성시 super() 를 이용해서 객체 생성은 된다 -> abstract class는 부모 클래스로서의 역할에 집중 
		a.eat();
	}
}









