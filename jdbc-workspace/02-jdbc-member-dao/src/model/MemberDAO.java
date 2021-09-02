package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String pass="tiger";
	public MemberDAO() throws ClassNotFoundException{
		Class.forName(driver);
		
	}
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException{
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void registerMember(MemberDAO vo) {
		Connection con=null;
		PreaparedStatement pstmt=null;
		try {
			con=DriverManager.getConnection(url,username,pass);
			String sql="insert into member(id,password,name,address) values(?,?,?,?)";
			pstmt=con.prepareStatement(1,vo.getId());
			pstmt.setString(1,vo.getId());
			pstmt.setString(1,vo.getPassword());
			pstmt.setString(1,vo.getName());
			pstmt.setString(1,vo.getAddress());

			
		}finally {
			closeAll(pstmt,con);
		}
	}
}
