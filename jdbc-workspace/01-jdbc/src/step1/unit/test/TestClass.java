package step1.unit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Class.forName 메서드의 역할을 확인하는 클래스
public class TestClass {
	public static void main(String[] args) {
		String driver = "oracle.driver.OracleDriver";
		try {
			Class.forName(driver);//MyDriver class loading -> static 영역 실행되고 meta space memory에 적재
			System.out.println("**jdbc Driver class loading**");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("oracle db와 connection : "+con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
