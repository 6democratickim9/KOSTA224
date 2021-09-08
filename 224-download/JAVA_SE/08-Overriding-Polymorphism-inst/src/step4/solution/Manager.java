package step4.solution;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의 
	public String getDetails() {
		//super를 이용해 부모 메서드를 재사용하고 추가 구현부분을 작성 
		return super.getDetails()+" department:"+department;
	}
}
