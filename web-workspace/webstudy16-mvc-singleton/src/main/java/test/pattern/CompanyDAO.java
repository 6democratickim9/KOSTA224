package test.pattern;

public class CompanyDAO {
	private static CompanyDAO instance=new CompanyDAO();
	private CompanyDAO() {
		System.out.println("companyDAO object created");
	}
	public static CompanyDAO getInstance() {
		return instance;
	}
}
