package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	public AccountDAO() throws ClassNotFoundException{
		Class.forName(DBInfo.DRIVER);
	}
	
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con)throws SQLException{
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DBInfo.URL,DBInfo.USERNAME,DBInfo.PASSWORD);
	}
}
