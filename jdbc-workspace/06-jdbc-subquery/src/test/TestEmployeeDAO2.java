package test;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Employee;
import model.EmployeeDAO;

public class TestEmployeeDAO2 {
	public static void main(String[] args) throws SQLException {
		try {
			EmployeeDAO dao = new EmployeeDAO();
//			Employee emp = new Employee("황의조","총무",600);
//			dao.register(emp);
//			System.out.println("사원등록완료");
			String job="개발";
//			해당 job 직종의 사원 중 가장 높은 salary를 받는 사원정보를 조회하는 메서드
			ArrayList<Employee> list = dao.getEmployeeListByHighSalaryandJob(job);
			for(int i =0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
