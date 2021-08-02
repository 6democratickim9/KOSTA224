package step1.review;//1.package 

//2.import 
//다른 팩키지의 자원을 이용하고자 할 때는 import 가 필요하다 
//import java.util.ArrayList;

//3.class 
public class Person {
	//4. instance variable 
	private String name;
	//5. Constructor 
	public Person(String name) {
		this.name=name;
	}
	//6. method 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
