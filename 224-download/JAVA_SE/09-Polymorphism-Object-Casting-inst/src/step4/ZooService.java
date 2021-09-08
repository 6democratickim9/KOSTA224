package step4;

public class ZooService {
	public void enter(Animal a) {
		//a가 참조하는 객체가 Person인지 확인 
		if(a instanceof Person)
			((Person) a).ticketing();//Object Casting
		a.play();
	}
}
