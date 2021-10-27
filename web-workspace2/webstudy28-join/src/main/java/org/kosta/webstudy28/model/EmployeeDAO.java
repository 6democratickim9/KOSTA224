package org.kosta.webstudy28.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class EmployeeDAO {
	private static EmployeeDAO instance = new EmployeeDAO();
	private DataSource dataSource;

	private EmployeeDAO() {
		this.dataSource = DataSourceManager.getInstance().getDataSource();
	}

	public static EmployeeDAO getInstance() {
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

	public int getTotalCount() throws SQLException {
		int totalCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "select count(*) from mvc_employee";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next())
				totalCount = rs.getInt(1);
		} finally {
			closeAll(pstmt, con);
		}
		return totalCount;

	}

	public ArrayList<EmployeeVO> getAllEmployeeList() throws SQLException {
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "select e.empno, e.ename, e.sal, d.dname, d.loc from mvc_employee e, mvc_department d where e.deptno=d.deptno order by e.empno desc";
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				DepartmentVO dvo = new DepartmentVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setSal(rs.getInt(3));
				dvo.setDname(rs.getString(4));
				dvo.setLoc(rs.getString(5));
				vo.setDepartmentVO(dvo);
				list.add(vo);
			}
		} finally {
			closeAll(rs, pstmt, con);

		}
		System.out.println(list);
		return list;
	}

}
