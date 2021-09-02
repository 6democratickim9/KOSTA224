package step2;
//MEMBER TABLE에 INSERT하는 예제

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC2 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("oracle jdbc driver loading");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@221.150.136.4:1521:xe","scott","tiger");
			System.out.println("connection success!");
			String sql="insert into member(id,password,name,address) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "vani1abean");//1의 의미는 첫 번째 ? 에 적용한다는 뜻 
			pstmt.setString(2, "asap");
			pstmt.setString(3, "민주");
			pstmt.setString(4, "삼성동");
			System.out.println("insert success");
			int result=pstmt.executeUpdate();//sql 실행해서 테이블에 영향을 준 row 수가 반환
			System.out.println("insert member " +result);
			pstmt.close();
			con.close();
			System.out.println("everything's closed");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
