package test.pattern;

public class TestSingletonDesignPattern {
	public static void main(String[] args) {
		System.out.println(CompanyDAO.getInstance());
		System.out.println(CompanyDAO.getInstance());
		System.out.println(CompanyDAO.getInstance());
	}
}
	
