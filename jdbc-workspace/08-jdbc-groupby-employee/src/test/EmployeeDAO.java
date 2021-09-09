package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String EmployeeDAO() {
		Class.forName(driver);
	}
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}
	public ArrayList<HashMap<String, Object>> findJobGroupList() {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>
		return list;
	}
}
