package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 *  DAO : Data Access Object  데이터 액세스 로직을 정의하는 객체 
 */
public class MemberDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "scott";
	private String pass = "tiger";

	public MemberDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	// 오버로딩
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		closeAll(pstmt, con);
	}

	/*
	 * DAO의 메서드에서는 Exception 을 main 으로 throws 처리한다
	 * 
	 * Connection insert sql 정의 PreparedStatement sql 실행 close
	 */
	public void registerMember(MemberVO vo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, username, pass);
			String sql = "insert into member(id,password,name,address) values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}

	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, username, pass);
			String sql = "select password,name,address from member where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);// 1 은 sql 의 첫번째 물음표
			rs = pstmt.executeQuery();
			// primary key로 검색했으므로 회원정보가 1명 존재하거나 존재하지 않는다
			if (rs.next()) {// 검색 결과 행row가 존재하면 true를 반환
				// rs.getString(1) -> sql의 column index ( 첫번째 컬럼 password 를 가르킨다 )
				vo = new MemberVO(id, rs.getString(1), rs.getString(2), rs.getString(3));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}

	/*
	 * member table에 저장된 회원 정보(id , name)를 list로 반환하는 메서드 list의 요소는 MemberVO이고
	 * MemberVO 객체의 id와 name 인스턴스 변수의 정보만 할당되면 된다
	 */
	public ArrayList<MemberVO> getAllMemberList() throws SQLException {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, pass);
			String sql="select id,name from member";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//방법1				
				//list.add(new MemberVO(rs.getString(1),null,rs.getString(2),null));
				//방법2
				MemberVO vo=new MemberVO();
				vo.setId(rs.getString(1)); 
				vo.setName(rs.getString(2));
				list.add(vo);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}// class



















