package step1;

class Student{
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class TestGetterSetter {
	public static void main(String[] args) {
		Student s = new Student("╧наж", 26);
		//String name = s.getName();
		//System.out.println(name);
		System.out.println("name: "+s.getName());
		System.out.println("age: "+s.getAge());
		//int age = s.getAge();
		//System.out.println("age: "+age);
	}
}

