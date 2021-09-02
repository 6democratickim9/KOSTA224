package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBC4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 회원의 아이디를 입력하세요: ");
		String id = scanner.nextLine();
		scanner.close();
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			String sql="delete from member where id=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			int result=pstmt.executeUpdate();
			if(result==1)
				System.out.println(id+" 아이디 회원정보를 삭제");
			else
				System.out.println(id+" 아이디 회원정보가 존재하지 않아 삭제하지 못했습니다");
			pstmt.close();
			con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
