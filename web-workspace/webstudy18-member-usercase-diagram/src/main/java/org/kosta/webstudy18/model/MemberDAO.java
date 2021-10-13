package org.kosta.webstudy18.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String userpass = "tiger";

	private MemberDAO() {
	}

	public static MemberDAO getInstance() {
		return instance;
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

	public MemberVO findMemberById(String id) throws SQLException {// membervo 의 형태로 반환하는 함수 생성
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "select name, address from member where id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next())
				vo = new MemberVO(id, null, rs.getString(1), rs.getString(2));
		} finally {
			closeAll(rs, pstmt, con);// 위의 수행이 다 끛아면 다 닫아준다
		}
		return vo; // 멤버 vo에 객체들을 할당해서 반환한다
	}

	public MemberVO login(String id, String password) throws SQLException {
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "select name, address from where id =? and password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next())
				vo = new MemberVO(id, password, rs.getString(1), rs.getString(2)); // sql문을 실행해서 해당되는 정보가 있다면
																					// id,pw,name,address를 받아서 membervo에
																					// set한다
		} finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

	public ArrayList<MemberVO> findMemberListByAddress(String address) throws SQLException {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, userpass);
			String sql = "select id, name from member where address=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, address);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new MemberVO(rs.getString(1), null, rs.getString(2), null));
			}//입력된 주소에 해당되는 멤버의 정보가 존재하면 id와 이름을 membervo에서 list에 get오브젝트해서 추가
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;

	}
	public void updateMember(MemberVO vo) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url,username,userpass);
			String sql = "update member set password=?,name=?,address=? where id=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1,vo.getPassword());
			pstmt.setString(2,vo.getName());
			pstmt.setString(3,vo.getAddress());
			pstmt.setString(4,vo.getId());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt,con);
		}
	}
	public void register(MemberVO vo)throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql = "insert into member(id,password,name,address) values(?,?,?,?)";
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
		}finally {
			closeAll(pstmt,con);
		}
	}

	public boolean idcheck(String id)throws SQLException{
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql = "select count(*) from member where id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()&&rs.getInt(1)==1)//조회정보가 1이면 아이디가 존재하므로 true할당
					result = true;
		}finally {
			closeAll(rs,pstmt,con);
		}
		return result;
	}

}

