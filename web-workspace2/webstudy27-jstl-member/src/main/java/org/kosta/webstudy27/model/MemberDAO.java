package org.kosta.webstudy27.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	public closeAll()
	public MemberCO findMemberById(String id) throws SQLException{
		MemberVO vo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getConnection();
		}
	}
}
