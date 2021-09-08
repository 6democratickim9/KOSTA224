package model;

public class Employee {
	private String empno;
	private String name;
	private String job;
	private int salary;
	public Employee(String name, String job, int salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;//사원 정보 생성 시에 필요
	}
	
	public Employee(String empno, String name, String job, int salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.job = job;
		this.salary = salary;//조회 시 필요
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
