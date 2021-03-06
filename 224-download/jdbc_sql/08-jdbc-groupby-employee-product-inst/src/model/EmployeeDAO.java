package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String password = "tiger";

	public EmployeeDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}
	/*
	 * select job,count(*), max(salary) as highestsal from S_EMPLOYEE group by job
	 * order by highestsal desc
	 */

	public ArrayList<HashMap<String, Object>> findJobGroupList() throws SQLException {
		ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, password);
			StringBuilder sql=new StringBuilder("select job,count(*), max(salary) as highestsal ");
			sql.append("from S_EMPLOYEE group by job ");
			sql.append("order by highestsal desc");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("job", rs.getString(1));
				map.put("empcount", rs.getInt(2));
				map.put("highestsal", rs.getInt(3));
				list.add(map);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}



























