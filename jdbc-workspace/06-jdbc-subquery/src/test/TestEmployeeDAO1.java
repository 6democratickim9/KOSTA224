package test;

import java.sql.SQLException;

import model.Employee;
import model.EmployeeDAO;

public class TestEmployeeDAO1 {
	public static void main(String[] args) throws SQLException {
		try {
			EmployeeDAO dao = new EmployeeDAO();
			Employee emp = new Employee("황의조","총무",600);
			dao.register(emp);
			System.out.println("사원등록완료");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
