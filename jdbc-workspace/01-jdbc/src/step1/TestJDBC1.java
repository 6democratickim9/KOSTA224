package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC1 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver);//class.forname( -> class를 로딩시킨다-> static 정보가 메타스페이스에 저장
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("oracle db와 connection : "+con);
			String sql="select id,password,name,address from member";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			rs.close();
			pstmt.close();
			con.close();
			System.out.println("jdbc driver loading");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
