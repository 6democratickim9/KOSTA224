package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String password="tiger";
	public MemberDAO() throws ClassNotFoundException{
		Class.forName(driver);
	}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con)throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}

}
