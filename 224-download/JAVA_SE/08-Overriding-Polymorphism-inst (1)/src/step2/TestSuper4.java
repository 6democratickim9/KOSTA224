package step2;

public class TestSuper4 {
	public static void main(String[] args) {
		Employee e=new Employee("123","아이유",500);
		System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		
		Manager m=new Manager("124","손흥민",700,"개발부");
		System.out.println(m.getEmpNo()+" "+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
		
		// Manager is a Employee -> is a 관계 
		// Employee의 instance variable : 3개 
		// Manager의 instance variable : 1개 
		
		// Employee와 Manager class 를 구현해 본다 
	}
}
