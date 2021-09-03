package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String password ="tiger";
	private PreparedStatement pstmt;
	
	public ProductDAO() throws ClassNotFoundException{
		Class.forName(driver);
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException{
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException{
		if(rs!=null) {
			rs.close();
			closeAll(pstmt,con);
		}
		}
	public int getProductTotalCount() throws SQLException {
		int totalCount=0;
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, username, password);
			String sql="select count(*) from products";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(totalCount, sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalCount;		
	}
}
