package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GuestBookDAO {
	private String driver="";
	private String url="";
	private String username="scott";
	private String password="tiger";
	public GuestBookDAO() throws ClassNotFoundException{
		Class.forName(driver);
	}
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}
	public ArrayList<GuestBookDTO> getAllGuestBookList() throws SQLException{
		ArrayList<GuestBookDTO> list=new ArrayList<GuestBook>DTO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con=DriverManager.getConnection(url,username,password);
			String sql = "select guestbook_no,title,content from guestbook order by guest_no desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new GuestBookDTO(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		// TODO Auto-generated method stub
		return null;
	}
	public void register(GuestBookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con=DriverManager.getConnection(url,username,password);
			StringBuilder sql = new StringBuilder();
			sql.append("insert into guestbook(guestbook_no,title,content)");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt,con);
		}
		
	}
}
