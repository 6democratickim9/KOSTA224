package step4.solution;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department = department;
	}
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������ 
	public String getDetails() {
		//super�� �̿��� �θ� �޼��带 �����ϰ� �߰� �����κ��� �ۼ� 
		return super.getDetails()+" department:"+department;
	}
}
